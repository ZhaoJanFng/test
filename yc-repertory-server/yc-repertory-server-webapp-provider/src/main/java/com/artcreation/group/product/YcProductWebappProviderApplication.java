package com.artcreation.group.product;

import org.apache.commons.configuration.DatabaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class YcProductWebappProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcProductWebappProviderApplication.class, args);
    }

}
