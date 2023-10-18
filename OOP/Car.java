package OOP;

public class Car {
    // changed
    private String color, model, transmission;
    private Double price = 0.00;

    public Car(){

    }
    public Car(String model, String color, String transmission, double price){
        setColor(color);
        setModel(model);
        setTransmission(transmission);
        setPrice(price);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public String getTransmission(){
        return transmission;
    }
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Car car = new Car("Chevrolet Cobalt", "Summit White", "Manual", 12500.00);
        System.out.println("Model= " + car.getModel());
        System.out.println("Color= " + car.getColor());
        System.out.println("Transmission= " + car.getTransmission());
        System.out.println("Price= " + car.getPrice());
    }
}
