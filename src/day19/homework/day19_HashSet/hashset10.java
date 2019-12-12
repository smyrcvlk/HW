package day19.homework.day19_HashSet;

import java.util.HashSet;

public class hashset10 {
    public static void main(String[] args) {
//10. Write a Java program to compare two hash set.

        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        HashSet<String> colors2 = new HashSet<String>();

        colors2.add("pink");
        colors2.add("blue");
        colors2.add("yellow");

        if(colors.contains("pink"))

        {
            System.out.println(" yes");

        }else{
            System.out.println("no");
        }

    }
}
