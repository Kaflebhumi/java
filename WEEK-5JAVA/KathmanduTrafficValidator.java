package WEEK-5 java ;
class SameLocationException extends RuntimeException{
    SameLocationException(String message){
        super(message);
    }
}
public class KathmanduTrafficValidator implements RouteValidator {
    @Override
    public boolean isValidCommuteRoute(String origin, String destination,double distanceKm) throws SameLocationException, InvalidRouteException {

        if (origin.equalsIgnoreCase(destination)) {
            throw new SameLocationException("Origin and destination cannot be the same!");
        }

        if (distanceKm < 0.1 || distanceKm > 30) {
            throw new InvalidRouteException("Distance " + distanceKm + "km is unrealistic " );
        }
        return true;
    }

    public static void main(String[] args) {
        KathmanduTrafficValidator a1 = new KathmanduTrafficValidator();

        try {
            boolean result =  a1.isValidCommuteRoute("Amarsing","Galeshwor",3);
            System.out.println("Valid route: " + result);
        }
        catch (SameLocationException e) {
            System.out.println("SameLocationException: " + e.getMessage());
        }
        catch (InvalidRouteException e) {
            System.out.println("InvalidRouteException: " + e.getMessage());
        }
         try {
           boolean result = a1.isValidCommuteRoute("Tokha","jhor",8);
            System.out.println("Valid route: " + result);
        }
        catch (SameLocationException e) {
            System.out.println("SameLocationException: " + e.getMessage());
        }
        catch (InvalidRouteException e) {
            System.out.println("InvalidRouteException: " + e.getMessage());
        }
         try {
            boolean result = a1.isValidCommuteRoute("Tokha","Greenland",43);
            System.out.println("Valid route: " + result);
        }
        catch (SameLocationException e) {
            System.out.println("SameLocationException: " + e.getMessage());
        }
        catch (InvalidRouteException e) {
            System.out.println("InvalidRouteException: " + e.getMessage());
        }
    }
}