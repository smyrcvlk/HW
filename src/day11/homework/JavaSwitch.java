package day11.homework;

public class JavaSwitch {

    public static void main(String[] args) {
        String grade = "123123";

        // int, char, string
        switch (grade){
            case "A":
                System.out.println("excellent");
                break;
            case "B+":
            case "B-":
            case "B":
                System.out.println("good");
                break;
            case "C+":
            case "C-":
            case "C":
                System.out.println("middle");
                break;
            case "D+":
            case "D-":
            case "D":
                System.out.println("pass");
                break;
            case "F":
                System.out.println("pass");
                break;
            default:
                System.out.println("invalid grade");
                break;
        }
    }
}
