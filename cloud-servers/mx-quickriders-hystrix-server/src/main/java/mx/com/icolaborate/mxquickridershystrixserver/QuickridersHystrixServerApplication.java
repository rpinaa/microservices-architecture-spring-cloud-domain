package mx.com.icolaborate.mxquickridershystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class QuickridersHystrixServerApplication {

	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickridersHystrixServerApplication.class, args);
	}
}
