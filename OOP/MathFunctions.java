package OOP;

public class MathFunctions {

    static double pi,e;
    static {
        MathFunctions.pi = 3.14159265359;
        MathFunctions.e = 2.71828182846;
    }
    static double square(double radius){

        return pi * radius * radius;
    }
    static double power(double a){
        return Math.pow(e, a);
    }
    static double triangleSquare(double a, double b, double c){
        double p = (a + b +c)/2;
        return Math.sqrt(p * (p - a) * (p-b) * (p-c));
    }

    public static void main(String[] args) {
        System.out.println(MathFunctions.square(8));
        System.out.println(MathFunctions.power(5));
        System.out.println(MathFunctions.triangleSquare(3,4,5));
    }



}
