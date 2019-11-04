package com.ozx.springcloudorderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @FeignClient name:指定服务名称
 */
@FeignClient(name = "springcloud-member-service")
public interface RemoteMemberApi {

    @GetMapping("/getMemberInfo")
    public String getMemberInfo();
}
