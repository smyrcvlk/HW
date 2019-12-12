package day11.homework;

public class IfElseStatementHomework1 {
//Find the Largest Number Among Three Numbers using user Input
//Finding largest of three numbers using if-else..if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//Output:
//
//78 is the largest Number
public static void main(String[] args) {

    int a = 34;
    int b = 45;
    int c = 78;

    if (a >= b && a >= c)
        System.out.println(a + " is a largest number");
    else if (b >= a && b >= c)
        System.out.println(b + " is a largest number");
    else
        System.out.println(c + " is a largest number");
}


}
