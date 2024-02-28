package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTask3 {
    public LinkedList<String> list;

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }

    public LinkedListTask3(){
        this.list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

    }
    public static void main(String[] args) {
        LinkedListTask3 Task3 = new LinkedListTask3();
        System.out.println(Task3.getList());

        // LinkedList Task3-a
        Task3.remove(0);

        // LinkedList Task3-b
        Task3.show_deleted_items();

        // LinkedList Task3-c
        Task3.list.clear();
        System.out.println(Task3.list);

    }

    public void remove(int index){
        list.remove(index);
        System.out.println(list);
    }
    public void show_deleted_items(){
        String first = list.getFirst();
        String last = list.getLast();
        list.removeFirst();
        list.removeLast();
        System.out.println("First(\"" + first + "\") and Last(\"" + last+ "\") items are deleted" );
        System.out.println(list);
    }

}
