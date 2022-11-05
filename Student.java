import java.sql.SQLOutput;

public class Student {
    private String name = "John";
    private String classes = "CO9";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setClasses("C09");
        s1.setName("TU");
        s2.setClasses("C10");
        s2.setName("HANH");
        System.out.println(s1 + " " + s2);
    }
}
