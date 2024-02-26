package test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLesson {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tico");
        list.add("Damas");
        list.add("Nexia");
        list.add("Lacetti");
        list.add("Nexia-3");
        list.add("Cobalt");


        list.remove("Nexia");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String item: list
//             ) {
//            System.out.println(item);
//        }

        System.out.println("Before sort: 0-indeksdagi element = " + list.get(0));
        Collections.sort(list);
        System.out.println("After sort: 0-indeksdagi element = " + list.get(0));
        list.forEach(s ->{
            System.out.println(s);
        });
    }

}
