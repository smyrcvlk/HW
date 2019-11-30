package day35.homework.constructor;

//create a class Bank
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
public class HW {
    public static void main(String[] args) {
        Bank bank= new Bank("chase",123, true);
        System.out.println(bank.getattributes());


    }
}
class Bank{
    public String name;
    public int serial_number;
    public boolean secure;

    public Bank(String n){
        name=n;
    }
    public Bank(String n, int sn){
        name=n;
        serial_number=sn ;
    }

    public Bank(String n, int sn, boolean yes){
         name=n;
         serial_number=sn;
          secure=yes;
    }

    public String getattributes(){
        return "name " + name + "\n"+
         "serial_numner " + serial_number + "\n"+
         "secure "+ secure + "\n" ;
    }
}