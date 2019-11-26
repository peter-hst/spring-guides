package hst.peter.task

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SchedulingTaskApplication {

	static void main(String[] args) {
		SpringApplication.run(SchedulingTaskApplication, args)
	}

}
