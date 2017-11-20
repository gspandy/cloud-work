package com.wl.cloud.client;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

/**
 * 云服务消费者(云服务中的api子模块依赖)
 * @author by wl
 * @date 2017/11/17.
 */

@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wl", "cn.ijiami"})
@Component
public class CloudClient {
}
