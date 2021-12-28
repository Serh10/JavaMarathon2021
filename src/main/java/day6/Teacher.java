package day6;

import java.util.Random;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    Random random = new Random();
    String ocenkap;

    public void evaluate(Student student) {
        int ocenka = random.nextInt(4) + 2;
        if (ocenka == 2) {
            ocenkap = "неудовлитворительно";
        } else if (ocenka == 3) {
            ocenkap = "удовлетворительно";
        } else if (ocenka == 4) {
            ocenkap = "хорошо";
        } else ocenkap = "отлично";

        System.out.println("Преподаватель " + nameTeacher + "\n" + "оценил студента с именем " + student.getNameStudent() + "\n" + "по предмету " + subject + "\n" +
                "на оценку " + ocenkap + ".");
    }
}
