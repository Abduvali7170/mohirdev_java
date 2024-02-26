package collection;

import java.util.ArrayList;

public class ArrayListTask1 {
    public static void main(String[] args) {
        // ArrayList task1-a
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println(colors);

        // ArrayList task1-b
        colors.set(0, "Grey");

        // ArrayList task1-c
        for (String color: colors){
            System.out.println(color);
        }
        System.out.println("Length of Colors list = " + colors.size());
    }

}
