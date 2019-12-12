package day23.homework;

import java.util.Arrays;

public class Homework {
/*
Given two strings s and t ,
write a java program to determine if t is an anagram of s.

Example 1:
a:3
n:1
g:1
r:1
m:1
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

 */

    // approach
//
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";
        System.out.println("String a: " + a + "\nString b: " + b);
        anagram(a, b);

        if (anagram(a, b)) {
            System.out.println("The words are an anagram ");
        } else
            System.out.println("The words are not anagrams");
    }

    private static boolean anagram(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return (Arrays.equals(a1, b1));
}}