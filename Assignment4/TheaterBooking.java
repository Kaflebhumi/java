public class TheaterBooking {
    public static void main(String[] args) 
    {
        RegularSeat rs = new RegularSeat("S-12");
        PremiumSeat ps = new PremiumSeat("L-12");
        System.out.println("Booking Regular Seats...");
        rs.bookSeat();
        System.out.println();
         System.out.println("Booking Premium Seats...");
        ps.bookSeat();
        System.out.println();
    }
}
abstract class Seat
{
    private String seatNumber;
    public Seat(String sn)
    {
        this.seatNumber=sn;
    }
    String getSeatNumber()
    {
        return seatNumber;
    }
    void setSeatNumber(String seatNumber)
    {
        this.seatNumber=seatNumber;
    }
    abstract void bookSeat();
}
class RegularSeat extends Seat
{
    public RegularSeat(String sn)
    {
        super(sn);
    }
    void bookSeat()
    {
        System.out.println("Seat Number: " +getSeatNumber());
        System.out.println("Booking is allowed anytime.");
    }
}
class PremiumSeat extends Seat
{
    public PremiumSeat(String sn)
    {
        super(sn);
    }
    void bookSeat()
    {
        System.out.println("Seat Number: " +getSeatNumber());
        System.out.println("Booking includes luxury tax and seats.");
    }
}