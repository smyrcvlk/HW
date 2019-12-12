package day19.homework.day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class javasettask16 {
    public static void main(String[] args) {
//16. you have list of numbers, determine if you have duplication there
        //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
        //ex2: [1, 2, 3] => no duplications

//        HashSet<Integer> mySet = new HashSet<>();
        System.out.println("EX1");
        List<Integer> mySet1 = new ArrayList();
        mySet1.add(1);
        mySet1.add(2);
        mySet1.add(3);
        mySet1.add(4);
        mySet1.add(4);
        mySet1.add(5);
        mySet1.add(6);


        HashSet<Integer> hashSet1 = new HashSet<>();

        boolean duplicate1 = false;
        for (int num1 : mySet1) {
            if (hashSet1.add(num1) == false) {
                duplicate1 = true;
            }
        }
        if (duplicate1)
            System.out.println("has duplications");
        else
            System.out.println("no duplications");


        System.out.println("EX2");
        List<Integer> mySet2 = new ArrayList();
        mySet2.add(1);
        mySet2.add(2);
        mySet2.add(3);

        HashSet<Integer> hashSet2 = new HashSet<>();
        boolean duplicate2 = false;
        for (int num2 : mySet2) {
            if (hashSet2.add(num2) == false) {
                duplicate2 = true;
            }
        }
        if (duplicate2)
            System.out.println("has duplications");
        else
            System.out.println("no duplications");

//        System.out.println(list + " size:" + list.size());
//
//        HashSet<Integer> mySet = new HashSet<>(list);
//        System.out.println(mySet + " size:" + mySet.size());
//
//        if (list.size() != mySet.size()) {
//            System.out.println("has duplications");
//        } else {
//            System.out.println("no duplications");
//        }


    }
}


