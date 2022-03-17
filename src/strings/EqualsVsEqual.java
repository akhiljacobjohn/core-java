package strings;

public class EqualsVsEqual {


    private static String str = null;
    private static  String str1 = "John";
    private static  String str3 = "Akhil";

    public static void main(String[] args) {
        System.out.println(str==str1);
        System.out.println(str==str3);
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str3));
    }

}
