package com.wl.cloud.server;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

/**
 * 云服务提供者（同时实现了消费者）
 * @author wl
 * @date 2017/11/17.
 */

@EnableEurekaClient
@Component
public class CloudServer {
}
