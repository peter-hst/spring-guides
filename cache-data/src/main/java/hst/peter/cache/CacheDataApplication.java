package hst.peter.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheDataApplication.class, args);
	}

}
