package OOP;

public class Person {
    // changed
    public String firstname, lastname;
    public int age;
    public Person(){
        this.firstname = "Abduvali";
        this.lastname = "Karimov";
        this.age = 39;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.firstname);
    }

}
