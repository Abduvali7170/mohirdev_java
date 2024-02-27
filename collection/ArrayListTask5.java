package collection;

import java.util.ArrayList;

public class ArrayListTask5 {
    public static void main(String[] args) {

        // ArrayList Task5-a
        ArrayListTask5 Task5 = new ArrayListTask5();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println( Task5.replace_two_elements(list1, "A", "D") );
        System.out.println( Task5.replace_two_elements(list1, "D", "A") );


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");

        // ArrayList Task5-b
        System.out.println( Task5.combine_two_lists(list1, list2) );

        // ArrayList Task5-c
        ArrayList<String> list = new ArrayList<>(3);
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        System.out.println(list);
        list.ensureCapacity(9);
        list.add("Element4");
        list.add("Element5");
        list.add("Element6");
        list.add("Element7");
        list.add("Element8");
        list.add("Element9");
        System.out.println(list);

    }

    public ArrayList<String> replace_two_elements(ArrayList<String> list, String element1, String element2){
        int idx1 = list.indexOf(element1);
        int idx2 = list.indexOf(element2);
        list.set(idx1, element2);
        list.set(idx2, element1);
        return list;
    }

    public ArrayList<String> combine_two_lists(ArrayList<String> list1, ArrayList<String> list2){
        list1.addAll(list2);
        return list1;
    }
}
