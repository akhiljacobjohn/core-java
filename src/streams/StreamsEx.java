package streams;

import core.EmployeeBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEx {
    private static EmployeeBean[] arrayOfEmps = {
            new EmployeeBean(1, "Jeff Bezos", 100000.0f),
            new EmployeeBean(2, "Bill Gates", 200000.0f),
            new EmployeeBean(3, "Mark Zuckerberg", 300000.0f)
    };

    private static List<String> lst = new ArrayList<>();


    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a", "b", "c");
        lst.add("A");
        lst.add("B");
        Stream.of(arrayOfEmps);
        lst.stream().forEach(System.out::println);
    }

}
