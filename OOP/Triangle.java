package OOP;

public class Triangle {
    // changed
    int base, height, hypotenuse;

    public Triangle(){
        this.base = 3;
        this.height = 4;
        this.hypotenuse = 5;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.base);
    }
}
