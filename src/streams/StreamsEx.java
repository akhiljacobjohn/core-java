package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsEx {



    public static void main(String[] args) {
        String[] arr = new String[]{"a","b","c"};

        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a","b","c");
    }

}
