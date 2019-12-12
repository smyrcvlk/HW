package day19.homework.day19_HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashset8 {
    public static void main(String[] args) {
        //8. Write a Java program to convert a hash set to a tree set.
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
        Set<Integer> tree_set = new TreeSet<Integer>(numbers);


        System.out.println("TreeSet elements: ");
        for(Integer treeset : tree_set) {
            System.out.println(treeset);


        }
    }
}
