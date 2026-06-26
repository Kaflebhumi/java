package WEEK-5 JAVA;
public class GPSNavigationModule implements NavigationService
{
    @Override
    public void navigate(String startPoint , String endPoint, RouteValidator ktv) throws NavigationFailedException
        {
          System.out.println("Attempting to navigate from " + startPoint + " to " + endPoint + "....");
          if(startPoint.equalsIgnoreCase("Baniyatar"))
          {
            throw new NavigationFailedException("GPS signal lost near Baniyatar, Welcome to Kathmandu traffic.");
          }
          try{
            ktv.isValidCommuteRoute(startPoint, endPoint, simulatedDistance(startPoint, endPoint));
            System.out.println("Navigation successful! Estimated Time: 15 minutes (or  depending on traffic");
           }
           catch(SameLocationException e)
           {
            throw new NavigationFailedException("Route Validation Failed! " + e);
           }
           catch(InvalidRouteException e)
           {
            throw new NavigationFailedException("Route Validation Failed! " + e);
           }
         private double simulatedDistance(String start , String end)
           {
            return 5.0;
           }
        }     
            public static void main(String[] args) 
    {
        RouteValidator ktv = new KathmanduTrafficValidator();
        GPSNavigationModule gps = new GPSNavigationModule();
        try
        {
            gps.navigate("Galeshworvhowk", "Fulbari", ktv);
            gps.navigate("Gongabu", "Baniyatar", ktv);
            gps.navigate("Tokha", "Greemland", ktv);
        }
        catch(NavigationFailedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}