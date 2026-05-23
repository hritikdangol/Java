class Book {
    String title;
    String author;
    int ISBN;

    Book(String t, String a, int i) {
        this.title = t;
        this.author = a;
        this.ISBN = i;
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

public class BookDetails {

    public static void main(String[] args) {

        Book b1 = new Book("Atomic Habits", "James Clear", 1289);
        Book b2 = new Book("Bhagwat Gita", "Vyasa", 1290);
        Book b3 = new Book("Ek Chihan", "R.K Narayan", 1291);
        Book b4 = new Book("Power", "Morgan Housel", 1292);
        Book b5 = new Book("The Psychology of Money", "Morgan Housel", 1293);

        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
        b4.showDetails();
        b5.showDetails();
    }
}