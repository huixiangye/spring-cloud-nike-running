package demo;

/**
 * Created by yehuixiang on 7/1/18.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main entry point for the Running Location Updater application.
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableCircuitBreaker
public class RunningLocationUpdaterApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunningLocationUpdaterApplication.class, args);
    }

}