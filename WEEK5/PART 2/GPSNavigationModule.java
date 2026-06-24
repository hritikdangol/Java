package WEEK5;
class GPSNavigationModule implements NavigationService {
    @Override
    public void navigate(String startPoint, String endPoint, RouteValidator validator) throws NavigationFailedException {
        System.out.println("Attempting to navigate from " + startPoint + " to " + endPoint + "...");
        try {
            validator.isValidCommuteRoute(startPoint, endPoint,simulatedDistance(startPoint, endPoint));
        } catch (InvalidRouteException | SameLocationException e) {
            throw new NavigationFailedException("Route validation failed!");
        }
        if (startPoint.equalsIgnoreCase("Kalanki")) {
            throw new NavigationFailedException("GPS signal lost near Kalanki! Welcome to Kathmandu traffic!");
        }
        System.out.println("Navigation successful! Estimated time: 20 minutes");
    }
    private double simulatedDistance(String start, String end) {
        return 5.0;
    }
    public static void main(String[] args) {
        GPSNavigationModule g1 = new GPSNavigationModule();
        RouteValidator validator = new KathmanduTrafficValidator();

        try {
            g1.navigate("Tokha", "Samakhusi", validator);
        } catch (NavigationFailedException e) {
            System.out.println(e.getMessage());
        }
        try {
            g1.navigate("Kalanki", "Samakhusi", validator);
        } catch (NavigationFailedException e) {
            System.out.println(e.getMessage());
        }
          try {
            g1.navigate("Tokha", "Tokha", validator);
        } catch (NavigationFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}