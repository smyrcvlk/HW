package day35.homework.constructor;

import jdk.swing.interop.SwingInterOpUtils;

//create a class Country
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it
public class HW3 {
    public static void main(String[] args) {
         Country country=new Country("TURKIYE","MEDIUM","ANKARA","R.ERDOGAN",80000000);
        System.out.println(country.getattributes());
    }
}
class Country {
    public String name;
    public String size;
    public String Capitalname;
    public String president;
    public int population;

    public Country(String n){
        name=n;

    }
    public Country(String n, String s){
        name=n;
        size= s;
    }
    public Country (String n, String s, String cn){
        name=n;
        size= s;
        Capitalname=cn;
    }
    public Country(String n, String s, String cn, String p){
        name=n;
        size= s;
        Capitalname=cn;
        president=p;
    }
    public Country(String n, String s, String cn, String p,int ppltn){
        name=n;
        size= s;
        Capitalname=cn;
        president=p;
        population=ppltn;
    }
    public String getattributes(){
        return "country name: " + name  +"\n"+
                "contry size:" + size+ "\n"+
                "Capitalname :" + Capitalname + "\n" +
                "president name:" + president + "\n" +
                "population: " + population + "\n" ;
    }

}