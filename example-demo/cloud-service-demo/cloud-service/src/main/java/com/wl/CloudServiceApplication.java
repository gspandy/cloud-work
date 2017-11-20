package com.wl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 云服务，只需引入cloud-server依赖和相关配置即可
 * @author wl
 * @date 2017/11/17
 */
@SpringBootApplication
public class CloudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceApplication.class, args);
	}
}
