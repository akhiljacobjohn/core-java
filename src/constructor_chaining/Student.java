package constructor_chaining;

public class Student extends Person{

    int roll;


    public Student(String firstname, String middlename, String lastname, int age, int roll) {
        super(firstname, middlename, lastname, age);
        this.roll = roll;
    }
}
