package hst.peter.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {
    private static final Logger log = LoggerFactory.getLogger(StudentItemProcessor.class);

    @Override
    public Student process(final Student student) throws Exception {
        final String name = student.getName().toUpperCase();
        final String birthday = student.getBirthday();
        final Double score = student.getScore();

        final Student transformStudent = new Student(name, birthday, score);
        log.info("Converting (" + student + ") into (" + transformStudent + ")");
        return transformStudent;
    }
}
