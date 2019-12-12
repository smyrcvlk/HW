package day43;
// Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there
public class Book {

    String name;
    String author;
    int pagenumber;

    public Book(String name, String author, int pagenumber) {
        this.name = name;
        this.author = author;
        this.pagenumber = pagenumber;
    }

    public  double price(){
        return 0.0;
    }
    public String book() {
        return "Book name: " + name + "\n"
                + "Author: " + author + "\n"
                + "Price: $" + price() + "\n\n";
    }
    }



class Childrenbook extends Book {


    public Childrenbook(String name, String author, int pagenumber) {
        super(name, author, pagenumber);
    }

    @Override
    public double price() {
        return super.price()+ 20.5;
    }
}
class Comics extends  Book{


    public Comics(String name, String author, int pagenumber) {
        super(name, author, pagenumber);
    }

    @Override
    public double price() {
        return super.price()+ 10.5;
    }



class cashier{

}
    public static void main(String[] args) {
       Book Childrenbook= new Childrenbook("the cat in the hat", "dr.seus", 24);
        System.out.println(Childrenbook.book());
       Book Comic= new Comics("spirderman","stan lee", 50);
        System.out.println(Comic.book());

    }
}