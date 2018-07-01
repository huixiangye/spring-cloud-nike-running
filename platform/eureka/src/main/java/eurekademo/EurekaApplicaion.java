package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yehuixiang on 7/1/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicaion {
    public static void main(String[] args){
        SpringApplication.run(EurekaApplicaion.class,args);
    }
}
