class Seat{
   private String seatnum;
    Seat(String sn){
        this.seatnum=sn;
    }
    public void setseatnum(String seatnum){
        this.seatnum=seatnum;
    }
    String getseatnum(){
        return seatnum;
    }
    void bookSeat()
    {
        System.out.println("DIplay seat");
    }
}
class RegularSeat extends Seat{
    RegularSeat(String sn){
        super(sn);
    }
    @Override
    void bookSeat(){
        System.out.println("Regular Seat");
        System.out.println("TIcket no:" +getseatnum() +" Booked at 10:53am");
        
    }
}
class PremiumSeat extends Seat{
    PremiumSeat(String sn){
        super(sn);
    }
    @Override
    void bookSeat(){
        System.out.println("Premium Seat");
        System.out.println("Ticket no:" +getseatnum() +" includes snack and luxury tax");
    }
}
public class TheaterBooking{
    public static void main(String [] args){
        Seat s1 = new RegularSeat("A1");
        Seat s2 = new PremiumSeat("B1");
        /// can be initialize in two ways using base class and main class
        RegularSeat r1= new RegularSeat("F9");
        PremiumSeat p1= new PremiumSeat("D7");
        s1.bookSeat();
        r1.bookSeat();
        s2.bookSeat();
        p1.bookSeat();
    }
}