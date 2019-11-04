package com.ozx.springcloudorderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName: Ext
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/10/1 2:42
 * @Version： 1.0
 **/
@RestController
public class ExtRibbonController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;
    private int requestNum = 1;

    @GetMapping("/ribbonExchange")
    public String ribbonExchange(){
       String requestUrl= getInstance()+"/getMemberInfo";
        requestNum++;
        System.out.println("requestNum:"+requestNum);
        System.out.println("requestUrl:"+requestUrl);
        String result = restTemplate.getForObject(requestUrl, String.class);
        return  result;
    }

    private String getInstance() {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("springcloud-member-service");
        if (instanceList == null || instanceList.size() ==0) {
            return null;
        }
        int requestServerNum = requestNum % instanceList.size();
        ServiceInstance serviceInstance = instanceList.get(requestServerNum);
        return serviceInstance.getUri().toString();
    }
}
