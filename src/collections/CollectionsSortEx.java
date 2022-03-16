package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSortEx {



    public static void main(String[] args) {
        List<String> arrlst = new ArrayList<>();
        arrlst.add("Akhil");
        arrlst.add("Yohan");
        arrlst.add("Jakob");
        arrlst.add("Betsol");

        Collections.sort(arrlst);

        Iterator<String> iter = arrlst.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }



    }






}
