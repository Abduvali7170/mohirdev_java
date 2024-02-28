package collection;

import java.util.LinkedList;

public class LinkedListTask1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // LinkedList Task1-a
        list.add("Yanvar");
        list.add("Fevral");
        list.add("Mart");
        list.add("Aprel");

        // LinkedList Task1-b
        LinkedListTask1 Task1 = new LinkedListTask1();
        Task1.show(list);

        // LinkedList Task1-c
        System.out.println("LinkedList size = " + list.size());
        list.clear();
        System.out.println("Cleared: " + list);
    }

    public void show(LinkedList<String> list ){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
