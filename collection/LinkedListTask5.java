package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTask5 {
    public static void main(String[] args) {
        LinkedList<Integer> prime_numbers = new LinkedList<>();
        prime_numbers.add(2);
        prime_numbers.add(3);
        prime_numbers.add(5);
        prime_numbers.add(7);
        prime_numbers.add(11);

        // LinkedList Task5-a
        LinkedListTask5 Task5 = new LinkedListTask5();
        Task5.shuffle(prime_numbers);
        System.out.println(prime_numbers);

        // LinkedList Task5-b
        List<Integer> arrayList = new ArrayList<Integer>(prime_numbers);
        System.out.println(arrayList);

        // LinkedList Task5-c
        Collections.sort(prime_numbers);
        System.out.println(prime_numbers);
    }

    public void shuffle(LinkedList<Integer> list){
        Collections.shuffle(list);
    }
}
