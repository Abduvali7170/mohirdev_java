package OOP;

public class Person_old {
    // changed
    public String firstname, lastname;
    public int age;
    public Person_old(){
        this.firstname = "Abduvali";
        this.lastname = "Karimov";
        this.age = 39;
    }

    public static void main(String[] args) {
        Person_old person = new Person_old();
        System.out.println(person.firstname);
    }

}
