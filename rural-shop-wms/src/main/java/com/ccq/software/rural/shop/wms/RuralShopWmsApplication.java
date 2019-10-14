package com.ccq.software.rural.shop.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@MapperScan("com.ccq.software.rural.shop.wms.mapper")
public class RuralShopWmsApplication {


    @Value("${from}")
    private String value;


    @GetMapping("/wms/index")
    public String wms(){
        return "wms-index"+value;
    }




    public static void main(String[] args) {
        SpringApplication.run(RuralShopWmsApplication.class, args);
    }

}
