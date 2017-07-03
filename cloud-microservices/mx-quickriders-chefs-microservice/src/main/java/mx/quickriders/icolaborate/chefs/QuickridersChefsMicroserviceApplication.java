package mx.quickriders.icolaborate.chefs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class QuickridersChefsMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickridersChefsMicroserviceApplication.class, args);
    }
}
