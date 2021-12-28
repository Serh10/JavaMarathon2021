package day9.Task1;

public class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName=subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo(){
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
