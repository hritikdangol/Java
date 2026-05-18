class Book {
    String title;
    String author;
     //constructor-method toinitialize objects//
    Book(String t, String a) {
        title = t;
        author = a;
    } 
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
public class Recordbook {
    public static void main(String[] args) {

        //objects//
        Book b1 = new Book("Maths", "James Aurthur");
        b1.display();//passing value//
    }
}
