package day19.homework.day19_HashSet;

import java.util.HashSet;

public class hashset13 {
    public static void main(String[] args) {

   //13. Write a Java Program to find duplication

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(2);
        numbers.add(9);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(77);


        if (numbers.size() != numbers.size()) {

            System.out.println("has duplications");
       } else {
            System.out.println("no duplications");
      }




    }
}
