package com.wl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 只需引入依赖cloud-register，增加配置即可
 */
@SpringBootApplication
public class CloudRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRegisterApplication.class, args);
	}
}
