import java.util.Scanner;
public class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        this.title = t;
        this.author = a;
        this.isbn = i;
    }
    void display() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

 class Checkerbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        books[0] = new Book("Java Basics", "James", "ISBN101");
        books[1] = new Book("Python Guide", "Guido", "ISBN102");
        books[2] = new Book("C Programming", "Dennis", "ISBN103");
        books[3] = new Book("Data Structures", "Mark", "ISBN104");
        books[4] = new Book("Web Development", "John", "ISBN105");
        System.out.print("Enter book title to search: ");
        String searchTitle = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(searchTitle)) {
                books[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }

        sc.close();
    }
}
