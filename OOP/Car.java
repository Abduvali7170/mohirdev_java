package OOP;

public class Car {
    // changed
    private String color, model, transmission;
    private Double price = 0.00;

    public Car(){
        this.color = "GAZ";
        this.model = "1JX69";
        this.price = 11200.00;
        this.transmission = "Manual";
    }
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);

    }
}
