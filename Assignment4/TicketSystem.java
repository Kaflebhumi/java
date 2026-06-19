public class TicketSystem {
    public static void main(String[] args)
    {
       TaxiTicket tt = new TaxiTicket("67NJ", 8000, 4);
      BusTicket bt = new BusTicket("890A", 2000, "Normal");
       FlightTicket ft = new FlightTicket("4J56", 140000, "A");
       System.out.println("//Taxi Ticket Details"); 
       tt.generateTicket();
       System.out.println();
       System.out.println("//Bus Ticket Details"); 
       bt.generateTicket();
       System.out.println();
       System.out.println("//Flight Ticket Details"); 
       ft.generateTicket();
       System.out.println();
    }
}
abstract class Ticket
{
    String ticketNumber;
    double price;
    public Ticket(String tn , double p)
    {
        this.ticketNumber=tn;
        this.price=p;
    }
    abstract void generateTicket();
}
class TaxiTicket extends Ticket
{
   int seatNumber;
   public TaxiTicket(String tn,double p,int sn)
   {
    super(tn, p);
    this.seatNumber=sn;
   }
   void generateTicket()
   {
    System.out.println("Ticket Number: " +ticketNumber);
    System.out.println("Ticket Price: " +price);
    System.out.println("Seat Number: " +seatNumber);
   }
}
class BusTicket extends Ticket
{
   String coachType;
   public BusTicket(String tn,double p,String ct)
   {
    super(tn, p);
    this.coachType=ct;
   }
   void generateTicket()
   {
    System.out.println("Ticket Number: " +ticketNumber);
    System.out.println("Ticket Price: " +price);
    System.out.println("Coach Type: " +coachType);
   }
}
class FlightTicket extends Ticket
{
   String boardingGate;
   public FlightTicket(String tn,double p,String bg)
   {
    super(tn, p);
    this.boardingGate=bg;
   }
   void generateTicket()
   {
    System.out.println("Ticket Number: " +ticketNumber);
    System.out.println("Ticket Price: " +price);
    System.out.println("Boarding Gate: " +boardingGate);
   }
}