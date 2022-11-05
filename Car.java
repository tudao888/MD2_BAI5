public class Car {
    private String name;
    private String engine;

    // khai bao thuoc tinh static numberOfCar;
    public static int numberOfCars;

    // khoi tao constructor cho lop;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    // khoi tao 1 ham display;
    public void display() {
        System.out.println(this.name + " " + this.engine);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "2022");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota", "2025");
        System.out.println(Car.numberOfCars);
        car1.display();
        car2.display();
    }
}
