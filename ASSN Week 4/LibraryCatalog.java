class libraryItem{
    String title;
    String author;
    int id;
    libraryItem (String t, String a, int id){
        this.title=t;
        this.author=a;
        this.id=id;
    }
    void getinfo(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Id:"+id);
    }
}
class Book extends libraryItem{
    int pages;
    Book(String t, String a,int id, int p){
        super(t,a,id);
        this.pages=p;
    }
    @Override
    void getinfo()
    {
        System.out.println("BOOK:");
        super.getinfo();
        System.out.println("Pages:"+pages);
    }
}
class magazine extends libraryItem{
    String frequency;
    magazine(String t, String a,int id, String f){
        super(t,a,id);
        this.frequency=f;
    }
    @Override
    void getinfo()
    {
        System.out.println("Magazine:");
        super.getinfo();
        System.out.println("Publication Frequency:"+frequency);
    }
}
class newspaper extends libraryItem{
    int issueNum;
    newspaper(String t, String a, int id, int in){
        super(t,a,id);
        this.issueNum=in;
    }
        @Override
    void getinfo()
    {
        System.out.println("NEWSPAPER:");
        super.getinfo();
        System.out.println("Issue Number:"+issueNum);
    }
}
public class LibraryCatalog {
    public static void main(String[] args) {

        libraryItem[] c1 = new libraryItem[3];

        c1[0] = new Book("Java Programming", "James Gosling", 101, 500);

        c1[1] = new magazine("National Geographic", "Editorial Team", 102, "Monthly");

        c1[2] = new newspaper("The Kathmandu Post", "KMG", 103, 2547);
        for(int i=0;i<c1.length;i++)
        {
          c1[i].getinfo();  
        }
    }
}