package hst.peter.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
    private final JdbcTemplate jdbcTemplate;

    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");
            jdbcTemplate.query("SELECT `NAME`, BIRTHDAY, SCORE FROM T_STUDENT",
                    (rs, row) -> new Student(rs.getString(1), rs.getString(2), rs.getDouble(3))
            ).forEach(student -> log.info("FOUND <" + student + "> in the database."));
            log.info("job after-----jobId:{}, id:{}", jobExecution.getJobId(), jobExecution.getId());
        }
    }
}
