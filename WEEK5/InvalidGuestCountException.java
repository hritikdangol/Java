package WEEK5;
class InvalidGuestCountException extends RuntimeException {
    public InvalidGuestCountException(String message) {
        super(message);
    }
}

class BudgetExceededException extends RuntimeException {
    public BudgetExceededException(String message) {
        super(message);
    }
}

class TikaCeremony extends FestivalActivity {

    int expectedguests;
    String mainfamilyElder;

    TikaCeremony(int eg, String mfe, double estimatedCost) {
        super("Tika Ceremony", estimatedCost);
        this.expectedguests = eg;
        this.mainfamilyElder = mfe;
    }

    @Override
    public void planActivity() throws InvalidGuestCountException, BudgetExceededException {

        if (expectedguests < 5) {
            throw new InvalidGuestCountException("Not enough guests");
        }

        if (estimatedCost > 50000) {
            throw new BudgetExceededException("High budget");
        }

        System.out.println("Tika ceremony with " + mainfamilyElder +
                " planned successfully for " + expectedguests + " guests");
    }

    public static void main(String[] args) {

        TikaCeremony t1 = new TikaCeremony(10, "Grandfather", 3000);

        try {
            t1.planActivity();
        } catch (InvalidGuestCountException | BudgetExceededException e) {
            System.err.println(e.getMessage());
        }
    }
}