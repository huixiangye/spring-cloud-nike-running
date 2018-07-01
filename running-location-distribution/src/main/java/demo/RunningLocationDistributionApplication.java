package demo;

/**
 * Created by yehuixiang on 7/1/18.
 */

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RunningLocationDistributionApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunningLocationDistributionApplication.class, args);
    }

}
