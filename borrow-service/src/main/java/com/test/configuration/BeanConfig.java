package com.test.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * author:Ben
 */

@Configuration
public class BeanConfig {
    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }
}
