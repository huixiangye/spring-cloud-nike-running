package hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by yehuixiang on 7/1/18.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardAppplication {

    public static void main(String[] args){
        SpringApplication.run(HystrixDashboardAppplication.class,args);
    }

}
