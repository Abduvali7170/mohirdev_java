package collection;

import java.util.LinkedList;

public class LinkedListTask4 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Mathematics");
        list1.add("Physics");
        list1.add("Chemical");
        list1.add("Biology");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Uzbek Languages");
        list2.add("Foreign Languages");
        list2.add("Nature");
        list2.add("Science");

        // LinkedList Task4-a
        LinkedListTask4 Task4 = new LinkedListTask4();
        System.out.println( Task4.combined_list(list1, list2) );

        // LinkedList Task4-b
        LinkedList<String> list_copy = new LinkedList<>(list1);

        // LinkedList Task4-c
        Task4.one_delete_show_others(list1);
    }

    public LinkedList<String> combined_list(LinkedList<String> list1, LinkedList<String> list2){
        list1.addAll(list2);
        return list1;
    }

    public void one_delete_show_others(LinkedList<String> list){
        list.remove(0);

        for (String item:list)
              {
                  System.out.println("item: " + item);
        }
    }

}
