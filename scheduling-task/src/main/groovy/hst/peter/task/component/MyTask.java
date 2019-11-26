package hst.peter.task.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class MyTask {
    private static final Logger log = LoggerFactory.getLogger(MyTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void reportCurrentTimeWithCron() {
        log.info("The time is now {} with Cron option.", dateFormat.format(new Date()));
    }
}
