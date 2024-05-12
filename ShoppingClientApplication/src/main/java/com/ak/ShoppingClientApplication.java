// ShoppingClientApplication.java
package com.ak;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingClientApplication.class, args);
    }
}
