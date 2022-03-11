package java8features;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
      //  lst.forEach((word) -> System.out.println(word));
        lst.forEach(System.out::println);
    }


}
