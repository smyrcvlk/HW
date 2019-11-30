package day35.homework.constructor;

import jdk.swing.interop.SwingInterOpUtils;

//create a class Person
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it
public class HW2 {
    public static void main(String[] args) {
        Person person= new Person("SUMEYRA", "CIVELEK","BROWN", "FEMALE", 28);
        System.out.println(person.getattributes());
        Person person2= new Person("betul", "CIVELEK","BROWN", "FEMALE", 27);
        System.out.println(person2.getattributes());
        Person person3= new Person("sumeyye", "CIVELEK","BROWN", "FEMALE", 23);
        System.out.println(person3.getattributes());
        Person person4= new Person("hamza", "CIVELEK","BROWN", "male", 23);
        System.out.println(person4.getattributes());
    }
}
class Person{
    public String name;
    public String lastname;
    public String eyecolor;
    public String gender;
    public int age;


    public Person (String n){
        name=n;
    }
    public Person(String n,String ln){
        name=n;
        lastname=ln;
    }
    public Person(String n,String ln,String brown){
        name=n;
        lastname=ln;
        eyecolor=brown;

    }
    public  Person(String n,String ln,String brown,String female){
        name=n;
        lastname=ln;
        eyecolor=brown;
        gender=female;
    }
    public Person(String n,String ln,String brown,String female, int a){
        name=n;
        lastname=ln;
        eyecolor=brown;
        gender=female;
        age=a;
    }
    public String getattributes(){
        return "person name :"+ name +"\n"+
                "person lastname :" + lastname+ "\n" +
                "eyecolor : " + eyecolor + "\n" +
                "gender :" + gender  + "\n"+
                "age : " + age + "\n" ;
    }
}