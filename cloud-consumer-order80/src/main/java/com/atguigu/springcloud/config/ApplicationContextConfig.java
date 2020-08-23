package com.atguigu.springcloud.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liziyi
 * @create 2020/8/19 17:53
 */
@Configuration
@EnableEurekaClient
public class ApplicationContextConfig {
    @Bean//用注解的方式，依赖注入
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
