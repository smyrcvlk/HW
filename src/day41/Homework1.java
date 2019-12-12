package day41;

public class Homework1 {

////*********************************************************************************************
//What will be the output of the following Java program?
//class X
//{
//    //Class X Members
//}
//
//class Y
//{
//  //  Class Y Members
//}
//
//class Z extends X, Y
//{
//   // Class Z Members no output compile error
//}

////*********************************************************************************************
//What will be the output of the following Java program?///output is =====> 10
//class A
//{
//    int i = 10;
//}
//
//class B extends A
//{
//    int i = 20;
//}
//
//public class MainClass // output is =====>10
//{
//    public static void main(String[] args)
//    {
//        A a = new B();
//
//        System.out.println(a.i);
//    }
//}
////*********************************************************************************************
//What will be the output of the following Java program? output is ====>1,2,3
//class A
//{
//    {
//        System.out.println(1);
//    }
//}
//
//class B extends A
//{
//    {
//        System.out.println(2);
//    }
//}
//
//class C extends B
//{
//    {
//        System.out.println(3);
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
////*********************************************************************************************
//What will be the output of the following Java program?  output  ====> class A
    //class B
    //class C

//class A
//{
//    String s = "Class A";
//}
//
//class B extends A
//{
//    String s = "Class B";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B
//{
//    String s = "Class C";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//}
////*********************************************************************************************
//What will be the output of the following Java program? output ====>THIRD
    //SECOND
    //FIRST
//class A
//{
//    static
//    {
//        System.out.println("THIRD");
//    }
//}
//
//class B extends A
//{
//    static
//    {
//        System.out.println("SECOND");
//    }
//}
//
//class C extends B
//{
//    static
//    {
//        System.out.println("FIRST");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
////*********************************************************************************************
//What will be the output of the following Java program?
//class A
//{
//    public A()
//    {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A
//{
//    public B()
//    {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B
//{
//    public C()
//    {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//output
//Class A Constructor
//Class B Constructor
//Class C Constructor
////*********************************************************************************************
//What will be the output of the following Java program?   output =====>Class Y
//class X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class Y");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        Y.staticMethod();
//    }
//}
////*********************************************************************************************
//What will be the output of the following Java program? output=====> compile error
//class X
//{
//    public X(int i)
//    {
//        System.out.println(1);
//    }
//}
//
//class Y extends X
//{
//    public Y()
//    {
//        System.out.println(2);
//    }
//}


}
