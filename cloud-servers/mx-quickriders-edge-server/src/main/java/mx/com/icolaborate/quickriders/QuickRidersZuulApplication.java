package mx.com.icolaborate.quickriders;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class QuickRidersZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(QuickRidersZuulApplication.class).web(true).run(args);
    }
}
