import javax.management.MBeanAttributeInfo;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    // khoi tao constructor khong tham so;

    public Circle() {
    }


    // khoi tao constructor co tham so radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    // khoi tao 2 phuong thuc access modifier là public: getRadius và getArea.

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10.15);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getRadius());
    }
     // ==> Mặc định của getRadius = 1.0;
}
