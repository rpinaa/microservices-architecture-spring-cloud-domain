package mx.com.icolaborate.quickriders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class QuickRidersEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickRidersEurekaServerApplication.class, args);
    }
}
