package com.ryan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by yehuixiang on 7/1/18.
 */
@SpringBootApplication
@EnableZuulProxy
public class EdgingServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(EdgingServiceApplication.class, args);
    }
}
