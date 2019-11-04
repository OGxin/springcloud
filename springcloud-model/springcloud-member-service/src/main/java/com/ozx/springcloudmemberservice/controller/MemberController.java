package com.ozx.springcloudmemberservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MemberController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/9/19 15:45
 * @Version： 1.0
 **/
@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getMemberInfo")
    public String getMemberInfo(){
        return "这是会员服务！"+serverPort;
    }
}
