package hst.peter.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GetwayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayDemoApplication.class, args);
	}

}
