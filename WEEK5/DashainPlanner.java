package WEEK5;
import java.util.List;
class DashainFestivalPlanner {
    public static void executeFestivalPlan(List<FestivalActivity> activities) {
        for (int i = 0; i < activities.size(); i++) {
            FestivalActivity activity = activities.get(i);

            activities.get(i).display();
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
            catch (FestivalplanningException e) {
            System.out.println("General Planning Error: " + e.getMessage());
        } 
        finally {
                System.out.println("Activity planning attempt for "+ activity.activityName + " completed.");
            }
        }
    }

    public static void main(String[] args) {
        List<FestivalActivity> activities = List.of(
            new TikaCeremony(2, "Ram", 5000),          
            new TikaCeremony(10, "Shyam", 20000),      
            new DeusiBhailo(List.of(), 2, 3000),       
            new DeusiBhailo(List.of("Tokha","Jhor","Samakhusi"), 5, 1000) 
        );

        executeFestivalPlan(activities);
    }
}