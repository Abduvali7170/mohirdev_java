package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask3 {
    public ArrayList<String> list;

    public ArrayListTask3(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        list1.add("Six");
        list1.add("Seven");

        this.list = list1;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        // ArrayList Task3-a
        ArrayListTask3 Task3 = new ArrayListTask3();
        System.out.println(Task3.getList());
        Task3.doing_reverse_order();
        System.out.println(Task3.getList());
        Task3.doing_reverse_order();

        // ArrayList Task3-b
        System.out.println(Task3.getSubList(3,5));
        System.out.println(Task3.getSubList(-10,10));

    }

    public void doing_reverse_order(){
        Collections.reverse(list);
    }

    public ArrayList<String> getSubList(int firstIndex, int lastIndex){
        ArrayList<String> sublist = new ArrayList<>();
        int i = firstIndex;
        if(i < 0) i = 0;
        while (i <= lastIndex && i < list.size()){
            sublist.add(list.get(i));
            i++;
        }
        return sublist;
    }

}
