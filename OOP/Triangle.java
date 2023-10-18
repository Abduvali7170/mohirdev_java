package OOP;

public class Triangle {
    // changed
    double base, height, hypotenuse;

    public Triangle(){

    }
    public Triangle(double base, double height, double hypotenuse){
        setBase(base);
        setHeight(height);
        setHypotenuse(hypotenuse);
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setHypotenuse(double hypotenuse){
        this.hypotenuse = hypotenuse;
    }
    public double getBase(){
        return base;
    }
    public  double getHeight(){
        return height;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }
    public double perimeter(){
        double perimeter =  base + height + hypotenuse;
        return perimeter;
    }
    public double square(){
        double square = base * height / 2;
        return square;
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Base= " + triangle.getBase());
        System.out.println("Height= " + triangle.getHeight());
        System.out.println("Hypotenuse= " + triangle.getHypotenuse());
        System.out.println("Perimeter= " + triangle.perimeter());
        System.out.println("Square= " + triangle.square());
    }
}
