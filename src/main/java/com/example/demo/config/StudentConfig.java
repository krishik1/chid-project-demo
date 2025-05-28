package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class StudentConfig {
    @Value("${student-url}")
    private String stdURL;

    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder.baseUrl(stdURL).build();
    }
}
