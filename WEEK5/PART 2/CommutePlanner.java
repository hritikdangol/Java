package WEEK5;
class CommutePlanner{
    void planMyCommute(String origin, String destination, RouteValidator validator, NavigationService navigator){
        System.out.println("Planning your commute from " + origin + " to " + destination + "...");
        try{
            navigator.navigate(origin, destination, validator);
        }
        catch(NavigationFailedException e){
            if(e.getCause() != null){
                System.out.println("Invalid route");
            }
                else{
                System.out.println("Cannot plan: GPS issue");
            }
        }
        finally{
            System.out.println("Commute planning for " + origin + " to " + destination + " completed.");
        }
    }
    public static void main(String[] args){
        KathmanduTrafficValidator a1 = new KathmanduTrafficValidator();
        GPSNavigationModule b1 = new GPSNavigationModule();
        CommutePlanner p1 = new CommutePlanner();
        p1.planMyCommute("Tokha", "Chabahil", a1, b1);
        System.out.println();
        p1.planMyCommute("Tokha", "Tokha", a1, b1);
         System.out.println();
        p1.planMyCommute("Kalanki", "Chabahil", a1, b1);
    }
}