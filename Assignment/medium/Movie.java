public class Movie {
    String name;
    String language;
    double rating;
    Movie(String n, String l, double r) {
        this.name = n;
        this.language = l;
        this.rating = r;
    }
    void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating);
        System.out.println("________________");
    }
    
}
class Moviedetails{
    public static void main(String [] args){
        Movie m1= new Movie("PK", "Hindi", 4.1);
        Movie m2= new Movie("3 Idiots", "Hindi", 4.4);
        Movie m3=new Movie("Jatrai jatra", "Nepali", 3.5);
        Movie m4=new Movie("Loot ", "Nepali", 4.6);
        Movie m5=new Movie("Kabbaddi", "Nepali", 4.5);
        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
        m5.displayMovieDetails();
    }
}