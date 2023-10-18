package OOP;

public class Point {
    private double x, y, z;
    public Point(){

    }
    public Point(double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4, 5);
    }

}
