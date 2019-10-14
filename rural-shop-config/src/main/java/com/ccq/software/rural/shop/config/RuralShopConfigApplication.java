package com.ccq.software.rural.shop.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
@EnableEurekaClient
public class RuralShopConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuralShopConfigApplication.class, args);
    }

}
