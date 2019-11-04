package com.ozx.springcloudorderservice.controller;

import com.ozx.springcloudorderservice.feign.RemoteMemberApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/9/19 17:13
 * @Version： 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private RemoteMemberApi remoteMemberApi;
    /**
     * RestTemplate是SpringBoot Web组件提供，而Ribbon负载均衡器是由导入EurekaClient jar而添加
     */
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "这是订单服务";
    }

    @RequestMapping("/getMemberService")
    public String getMemberService(){
        String url = "http://springcloud-member-service/getMemberInfo";
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/feignMemberService")
    public String feignMemberService(){
        return remoteMemberApi.getMemberInfo();
    }
}
