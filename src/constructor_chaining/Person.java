package constructor_chaining;

public class Person {
    String firstname;
    String middlename;
    String lastname;
    int age;

    public Person(String firstname, String middlename, String lastname, int age) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.age = age;
    }


    public Person(String firstname, String lastname, int age){
        this(firstname,"", lastname, 33 );
    }


    public static void main(String[] args) {
        Person person = new Person("Akhil","John", 33);
        System.out.println(person.firstname);
        System.out.println(person.middlename);
        System.out.println(person.lastname);
        System.out.println(person.age);
    }
}
