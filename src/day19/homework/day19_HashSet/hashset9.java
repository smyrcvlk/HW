package day19.homework.day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashset9 {
    public static void main(String[] args) {
//9. Write a Java program to convert a hash set to a List/ArrayList.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);
        numbers.add(4);
        numbers.add(5);
        numbers.add(78);
        numbers.add(5);
        numbers.add(3);
        numbers.add(77);
        System.out.println(numbers);
        List<Integer> list = new ArrayList<Integer>(numbers);

        System.out.println("array list:"  + numbers);

    }
}
