public class Student1 {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


    // khoi tao constructor cho class
    public Student1(int r, String n) {
        rollno = r;
        name = n;
    }

    // khoi tao phuong thuc static de thay doi gia tri cua bien college;
    static void change() {
        college = "CODEGYM";
    }

    // khoi tao phuong thuc display

    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student1.change();


        // tao doi tuong:
        Student1 s1 = new Student1(1, "DAO");
        Student1 s2 = new Student1(2, "ANH");
        Student1 s3 = new Student1(3, "TU");

        // Goi phuong thuc display;

        s1.display();
        s2.display();
        s3.display();
    }
}
