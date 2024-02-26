package OOP;

public class Person {
    String name, address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }

    public static void main(String[] args) {
        Person p = new Person("Abduvalijon Karimov", "Andijon tumani Damariq MFY Nodirabegim 97-uy");
        System.out.println(p.toString());
    }
}
