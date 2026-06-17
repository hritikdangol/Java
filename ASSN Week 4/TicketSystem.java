class Ticket{
    int ticketnum;
    double price;
    Ticket(int tn, double p){
        this.ticketnum=tn;
        this.price=p;
    }
    void generateTicket()
    {
        System.out.println("Your ticket num is:");
    }
}
class Busticket extends Ticket{
    String seatnum;
    Busticket(int tn, double p, String sn){
        super(tn,p);
        this.seatnum=sn;
    }
    @Override
   void generateTicket(){
        System.out.println("BUS TICKET");
        System.out.println("Your Ticket num is:" +ticketnum);
        System.out.println("Price:" +price);
        System.out.println("Seat Number:" +seatnum);
    }
}
class trainTicket extends Ticket{
    String coachtype;
    trainTicket(int tn, double p, String ct){
        super(tn,p);
        this.coachtype=ct;
    }
        @Override
   void generateTicket(){
        System.out.println("TRAIN TICKET");
        System.out.println("Your Ticket num is:" +ticketnum);
        System.out.println("Price:" +price);
        System.out.println("Coach Type:" +coachtype);
    }
}
class flightTicket extends Ticket{
    String boardinggate;
    flightTicket(int tn, double p, String bg){
        super(tn,p);
        this.boardinggate=bg;
    }
        @Override
   void generateTicket(){
        System.out.println("FLIGHT TICKET");
        System.out.println("Your Ticket num is:" +ticketnum);
        System.out.println("Price:" +price);
        System.out.println("Boarding Gate:" +boardinggate);
    }
}
public class TicketSystem{
    public static void main(String[] args){
        Busticket b1= new Busticket(2026078,1600,"A9");
        trainTicket t1= new trainTicket(20507, 2200,"A1(AC)");
        flightTicket f1= new flightTicket(6768,108000,"Gate A");
        b1.generateTicket();
        t1.generateTicket();
        f1.generateTicket();
    }
}