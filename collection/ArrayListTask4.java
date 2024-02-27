package collection;

import java.util.ArrayList;

public class ArrayListTask4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Green");
        list1.add("Red");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Red");
        ArrayListTask4 Task4 = new ArrayListTask4();
        System.out.println( Task4.compare_elements(list1, list2) );

    }

    public ArrayList<String> compare_elements(ArrayList<String> list1, ArrayList<String> list2){
//        int length1 = list1.size();
//        int length2 = list2.size();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) == list2.get(i)) list.add("Yes");
            else list.add("No");
        }
        return list;
    }
}
