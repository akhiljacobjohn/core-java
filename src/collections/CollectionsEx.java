package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsEx {



    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();


        lst.add("A");
        lst.add("K");
        lst.add("H");
        lst.add("I");
        lst.add("L");

        List<String> lstAnother = new ArrayList<>(lst);
        Iterator<String> iter = lstAnother.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        if(lst.containsAll(lstAnother))
            System.out.println("List Matches");
        else
            System.out.println("Does not match");





    }
}
