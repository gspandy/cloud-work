package com.wl.api;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 提供给客户端的api，只需@FeignClient指定本服务名即可
 * @author wl
 * @date 2017/11/17.
 */

@FeignClient(value = "CLOUD-SERVICE")
public interface CloudServiceApi {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
