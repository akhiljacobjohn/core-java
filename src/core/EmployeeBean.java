package core;

public class EmployeeBean {
    String name;
    int id;
    float salary;

    public EmployeeBean(int id, String name, float salary) {
        this.name = name;

        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }
}
