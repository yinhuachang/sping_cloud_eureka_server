package com.yin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/1/14 0014.
 */
@SpringBootApplication
@EnableEurekaServer
@PropertySource(value = "classpath:/config/*.yml", ignoreResourceNotFound = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
