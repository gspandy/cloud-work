package com.wl.cloud.client.config;

import com.wl.cloud.client.utils.WebContextUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * 微服务间通信授权
 *
 * @author wl
 * @date 2018/3/28.
 */
@Configuration
public class RequestInterceptorConfig implements RequestInterceptor{

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private static final String BEARER_TOKEN_TYPE = "Bearer";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String accessToken = WebContextUtil.getAccessToken();
        requestTemplate.header(AUTHORIZATION_HEADER,
                String.format("%s %s",
                        BEARER_TOKEN_TYPE,
                        accessToken));
    }
}
