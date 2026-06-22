package WEEK5;
import java.util.List;
class NoRouteException extends RuntimeException {
    NoRouteException(String message) {
        super(message);
    }
}
public class DeusiBhailo extends FestivalActivity {
    List<String> plannedroutes;
    int numberofPerformer;

    DeusiBhailo(List<String> pr, int nop, double estimatedcost) {
        super("Deusi Bhailo Program", estimatedcost);
        this.plannedroutes = pr;
        this.numberofPerformer = nop;
    }

    @Override
    public void planActivity() throws NoRouteException, FestivalplanningException {

        if (plannedroutes.isEmpty()) {
            throw new NoRouteException("No route planned");
        }

        if (numberofPerformer < 3) {
            throw new FestivalplanningException("Need 3 performers");
        }

        System.out.println("Deusi Bhailo program with " + numberofPerformer
                + " performers planned for " + plannedroutes.size() + " routes!");
    }

    public static void main(String[] args) {

        try {
            DeusiBhailo d1 = new DeusiBhailo(List.of("Tokha", "Jhor"), 3, 5000);
            d1.planActivity();
        } catch (NoRouteException | FestivalplanningException e) {
            System.out.println(e.getMessage());
        }
        try {
            DeusiBhailo d2 = new DeusiBhailo(List.of(), 5, 8000);
            d2.planActivity();
        } catch (NoRouteException | FestivalplanningException e) {
            System.out.println(e.getMessage());
        }
        try {
            DeusiBhailo d3 = new DeusiBhailo(List.of("Samakhusi", "Jhor"), 2, 6000);
            d3.planActivity();
        } catch (NoRouteException | FestivalplanningException e) {
            System.out.println(e.getMessage());
        }
    }
}