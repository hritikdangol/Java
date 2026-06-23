package WEEK5;
public interface NavigationService{
    void navigate(String startPoint, String endPoint, RouteValidator validator) throws NavigationFailedException;
}
class NavigationFailedException extends RuntimeException{
    NavigationFailedException(String message){
        super(message);
    }
}