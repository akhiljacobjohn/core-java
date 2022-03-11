package core;

public class AssertEx {
    static int age = 18;

    public static void main(String[] args) {
        assert age < 20 : "Age is less";
        System.out.println("Age is " + age);

    }
}
