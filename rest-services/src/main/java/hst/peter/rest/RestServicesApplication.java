package hst.peter.rest;

import hst.peter.rest.domian.Msg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class RestServicesApplication {
    private String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public static void main(String[] args) {
        SpringApplication.run(RestServicesApplication.class, args);
    }

    @GetMapping("/hello")
    public Msg hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Msg(counter.getAndIncrement(), String.format(template, name));
    }
}
