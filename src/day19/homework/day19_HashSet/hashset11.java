package day19.homework.day19_HashSet;

import java.util.HashSet;

public class hashset11 {
    public static void main(String[] args) {
//11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);

        HashSet<String> colors2 = new HashSet<String>();

        colors2.add("pink");
        colors2.add("blue");
        colors2.add("yellow");
        colors2.add("white");

        System.out.println(colors2);
         colors.retainAll(colors2);
        System.out.println(colors);


    }
}
