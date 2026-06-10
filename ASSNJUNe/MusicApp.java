class song{
    String title;
    String artist;
    song(String t, String at){
        this.title=t;
        this.artist=at;
    }
    void play(){
        System.out.println(title + " is playing..... \n Artist " + artist);
    }
}
class popSong extends song{
    popSong(String t, String at){
        super(t,at);
    }
    @Override 
    void play() {
        {
            System.out.println("POP SONG");
            super.play();
        }
    }
}
class rockSong extends song{
    rockSong(String t, String at){
        super(t,at);
    }
    @Override 
    void play() {
        {
            System.out.println("POP SONG");
            super.play();
        }
    }
}
class jazzSong extends song{
    jazzSong(String t, String at){
        super(t,at);
    }
    @Override 
    void play() {
        {
            System.out.println("POP SONG");
            super.play();
        }
    }
}
public class MusicApp {
    public static void main(String[] args) {
        song[] s=new song[3];
        s[0]=new popSong("Hold me","James");
        s[1]=new rockSong("Numb","Aloan");
        s[2]=new jazzSong("Take five","Dave");
        for(int i=0;i<s.length;i++)
        {
            s[i].play();
        }
    }
}