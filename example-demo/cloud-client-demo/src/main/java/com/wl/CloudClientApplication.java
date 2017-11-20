package com.wl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 客户端，只需引入服务提供的api即可
 */
@SpringBootApplication
public class CloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

}
