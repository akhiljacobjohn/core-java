package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayAsListEx {


    public static void main(String[] args) {
        String[] arr = new String[]{"A", "B", "C"};
        List<String> lst = Arrays.asList(arr);
        List<String> lst2 = new ArrayList<>(Arrays.asList(arr));
        //This will give an error, as this operation is not allowed.
      //  lst.add("Y");
        //Replacing an element is allowed
        lst2.set(1,"D");
        System.out.println();
        lst2.add(lst2.size(), "E");


      //  lst.stream().forEach(x-> System.out.println(x.toLowerCase(Locale.ROOT)));
        lst2.stream().forEach(x-> System.out.println(x.toLowerCase(Locale.ROOT)));




    }


}
