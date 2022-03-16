package core;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Reflection {

    public static List<String> lst = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeBean bean = new EmployeeBean('1', "Akhil", 100.0f);
        Field[] field = bean.getClass().getDeclaredFields();
        for (Field fields : field) {
            lst.add(fields.getName());
        }
//        for(Field fields: field){
//            System.out.println(fields.getName());
//        }
    }

}
