package hst.peter.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class MyBean implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyBean.class);
    private String[] userList = {"peter-hst", "ElemeFE", "leezng", "shiftkey"};
    private GitHubLookupService service;

    public MyBean(GitHubLookupService service) {
        this.service = service;
    }

    public void run(String... args) {
        Arrays.stream(userList).parallel().map(service::findUser).forEach(u -> {
            try {
                logger.info("done: {}", u.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

}