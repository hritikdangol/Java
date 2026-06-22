class GPSNavigationModule implements NavigationService {
    @Override
    public void Maps(String startPoint, String endPoint, RouteValidator validator) {
        System.out.println("Attempting to navigate from " + startPoint + " to " + endPoint);
        try{
            validator.isValidCommuteRoute(startPoint, endPoint, simulatedDistance(startPoint, endPoint));
        } catch (InvalidRouteException | SameLocationException e) {
            NavigationFailedException failed = new NavigationFailedException("Route validation failed!");
            failed.initCause(e);
            throw failed;
        }
    }
}