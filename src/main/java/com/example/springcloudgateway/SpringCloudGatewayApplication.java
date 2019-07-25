package com.example.springcloudgateway;

import com.example.springcloudgateway.filter.TokenFilter;
import com.example.springcloudgateway.filter.factory.RequestTimeGatewayFilterFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }

    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }


}
