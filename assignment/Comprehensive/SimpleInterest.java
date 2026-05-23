public class SimpleInterest {

    private double principal;
    private double rate;
    private double time;
    SimpleInterest(double p, double r, double t) {
        this.principal = p;
        this.rate = r;
        this.time = t;
    }
    double getPrincipal() {
        return principal;
    }
    void setPrincipal(double principal) {
        this.principal = principal;
    }
    double getRate() {
        return rate;
    }
     void setRate(double rate) {
        this.rate = rate;
    }
    double getTime() {
        return time;
    }

    void setTime(double time) {
        this.time = time;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}

 class CalculationPTR {
    public static void main(String[] args) {

        SimpleInterest s1 = new SimpleInterest(10000, 5, 2);
        System.out.println("Principal: " + s1.getPrincipal());
        System.out.println("Rate: " + s1.getRate());
        System.out.println("Time: " + s1.getTime());
        s1.calculateInterest();
    }
}