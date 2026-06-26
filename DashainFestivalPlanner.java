import java.util.List;

public class DashainFestivalPlanner {

    public static void executeFestivalPlan(List<FestivalActivity> activities) {

        for (FestivalActivity activity : activities) {

            activity.display();

            try {
                activity.planActivity();
            }

            catch (InvalidGuestCountException e) {
                System.out.println("Planning Warning (Guests): " + e.getMessage());
            }

            catch (BudgetExceededException e) {
                System.out.println("Planning Warning (Budget): " + e.getMessage());
            }

            catch (NoRouteException e) {
                System.out.println("Planning Warning (Routes): " + e.getMessage());
            }

            catch (FestivalPlanningException e) {
                System.out.println("General Planning Error: " + e.getMessage());
            }

            finally {
                System.out.println("Activity planning attempt for "
                        + activity.getActivityName()
                        + " completed.");
            }
        }
    }

    public static void main(String[] args) {

        List<FestivalActivity> activities = List.of(
                new TikaCeremony(3, "Jenisha ", 8000),
                new TikaCeremony(11, "Riya", 4000),
                new DeusiBhailo(List.of(), 6, 4000),
                new DeusiBhailo(
                        List.of("Pokhra", "Kathmandu", "Jhapa"),
                        3,
                        6700)
        );

        executeFestivalPlan(activities);
    }
}