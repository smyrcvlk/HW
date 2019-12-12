package day19.homework.day19_HashSet;

import java.util.HashSet;

public class hashset12 {
    public static void main(String[] args) {
//12. Write a Java program to remove all of the elements from a hash set.
        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);

        colors.clear();

        System.out.println(colors);
    }
}
