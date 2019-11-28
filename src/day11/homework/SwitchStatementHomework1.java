package day11.homework;


import java.util.Scanner;

// done , homework
public class SwitchStatementHomework1 {

//    Write a code that displays the name of the day
//    it declares an int named day whose value represents a day(1-7).
//    The code displays the name of the day, based on the value of the day, using the switch statement.
//

    //Input 5
//    Output:
//    Friday
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number");

        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("not in range");
                break;


        }
    }
}