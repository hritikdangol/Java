class TaxPayer {
    String name;
    double income;
    double tax;
    TaxPayer(String n, double i) {
        this.name = n;
        this.income = i;
    }

    void calculateTax() {
        if (income <250000) {
            tax = 0;
        } else if (income<=500000) {
            tax = income *0.10;
        } else if (income<=1000000) {
            tax = income*0.20;
        } else {
            tax = income*0.30;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Income: " + income);
        System.out.println("Tax Payable: " + tax);
    }
}

class Paytax {
    public static void main(String[] args) {

        TaxPayer t1 = new TaxPayer("Hritik", 300000);
        TaxPayer t2 = new TaxPayer("Ranil", 1200000);
        t1.calculateTax();
        t1.display();
        t2.calculateTax();
        t2.display();
    }
}