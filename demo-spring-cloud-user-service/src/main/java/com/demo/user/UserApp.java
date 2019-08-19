package com.demo.user;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDistributedTransaction
@EnableTransactionManagement
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }

}
