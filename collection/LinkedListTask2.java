package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTask2 {
    public static void main(String[] args) {

        LinkedListTask2 Task2 = new LinkedListTask2();
        LinkedList<String> list = new LinkedList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");

        // LinkedList Task2-a
        Task2.reverse_list(list);
        System.out.println(list);
        Task2.reverse_list(list);

        // LinkedList Task2-b
        list.addFirst("Sunday");
        list.addLast("Saturday");
        System.out.println(list);

        // LinkedList Task2-c
        System.out.println("First is: " + list.getLast() + ", Last is:" + list.getLast());
    }

    public void reverse_list(LinkedList<String> list){
        Collections.reverse(list);
    }
}
