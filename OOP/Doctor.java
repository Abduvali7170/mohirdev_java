package OOP;

public class Doctor {
    private int salary;
    private String specialize;
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSpecialize(String specialize){
        this.specialize = specialize;
    }
    public String getSpecialize(){
        return specialize;
    }

    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg();
        xirurg.setSalary(500);
        xirurg.setSpecialize("Xirurg");
        System.out.println("Specialize= " + xirurg.getSpecialize());
        System.out.println("Salary= " + xirurg.getSalary());
        System.out.println("Can Operation= " + xirurg.getCanOperation());


        Lor lor = new Lor();
        lor.setSalary(300);
        lor.setSpecialize("Lor");
        lor.setCertificate(true);
        System.out.println("Specialize= " + lor.getSpecialize());
        System.out.println("Salary= " + lor.getSalary());
        System.out.println("Has certificate= " + lor.getCertificate());
    }
}
