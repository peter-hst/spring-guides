package hst.peter.batch;

import java.util.Date;

public class Student {
    private String name;
    private String birthday;
    private Double score;

    public Student(String name, String birthday, Double score) {
        this.name = name;
        this.birthday = birthday;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", score=" + score +
                '}';
    }
}
