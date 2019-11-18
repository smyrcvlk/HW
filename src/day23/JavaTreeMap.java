package day23;

import java.util.HashMap;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zzzz", 250);
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);
        System.out.println(map);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zzzz", 250);
        treeMap.put("Apple", 100);
        treeMap.put("Lemon", 200);
        treeMap.put("Peach", 150);
        treeMap.put("Melon", 145);
        treeMap.put("Berry", 250);
        System.out.println(treeMap);



    }
}
