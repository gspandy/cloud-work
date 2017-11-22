package com.wl.cloud.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 自定义注解解析
 * @author by wl
 * @date 2017/11/21.
 */

@Configuration
@PropertySource({"classpath:/config/cloud.properties"})
public class DefaultServerConfig {
}
