 public interface RouteValidator {
 boolean isValidCommuteRoute(String origin, String destination,double distanceKm) throws InvalidRouteException;
}
class InvalidRouteException extends Exception{
    InvalidRouteException(String message){
        super(message);
    }
}
