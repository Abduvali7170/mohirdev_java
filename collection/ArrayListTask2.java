package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask2 {
    public static void main(String[] args) {

        // ArrayList Task2-a
        ArrayList<Integer> IntNumbers = new ArrayList<>();
        IntNumbers.add(1);
        IntNumbers.add(10);
        IntNumbers.add(100);
        IntNumbers.add(1000);
        System.out.println(IntNumbers);

        int number = 101;

        // contains yordamida qidirish
        if(IntNumbers.contains(number))
            System.out.println(number + " soni IntNumbers ro`yhatida bor");
        else
            System.out.println(number + " soni IntNumbers ro`yhatida yo`q");

        // indexOf yordamida qidirish
        if(IntNumbers.indexOf(number) >= 0)
            System.out.println(number + " soni IntNumbers ro`yhatida bor");
        else
            System.out.println(number + " soni IntNumbers ro`yhatida yo`q");

        // ArrayList Task2-b
        ArrayList<Integer> newIntNumbers = new ArrayList<>(IntNumbers);

        // ArrayList Task2-c
        Collections.shuffle(IntNumbers);
    }
}
