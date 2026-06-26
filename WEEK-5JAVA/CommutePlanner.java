package WEEK-5 JAVA;
public class CommutePlanner
{
  public static void planMyCommute(String origin, String destination, RouteValidator ktv, NavigationService navigator)  
  {
    System.out.println( "Planning your commute from " + origin + " to " + destination + "...");
    try
    {
       gps.navigate(origin,destination,ktv);
    }
    catch(NavigationFailedException e)
    {
        if(e)
    }
  } 
  public static void main(String[] args)
  {
    RouteValidator ktv = new KathmanduTrafficValidator();
    NavigationService gps = new GPSNavigationModule();
    planMyCommute("Baneshwor", "Kalanki", ktv, gps);
    planMyCommute("Gongabu", "Baniyatar", ktv, gps);
    planMyCommute("Amarshing chowk", "galeshwor", ktv, gps);

  }
}