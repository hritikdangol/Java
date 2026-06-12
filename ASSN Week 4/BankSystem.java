 import java.util.Scanner;
class Bankaccount {
    private double accountNumber;
    private double balance;
    Bankaccount(double aN, double b) {
        this.accountNumber = aN;
        this.balance = b;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Current balance: " + balance);
            System.out.println("Amount withdrawn: " + amount);
        }
    }
    public void setAccountNumber(int acn){
        this.accountNumber=acn;
    }
    public double getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }
}
class Savingaccount extends Bankaccount{
    private double Intrestrate;
    Savingaccount(double in,int aN, double b){
        super(aN, b);
        this.Intrestrate=in;
    }
    public void setIntrestrate(double Intrestrate){
        this.Intrestrate=Intrestrate;
    }
    public double getIntrestrate(){
        return Intrestrate;
    }
    @Override
    void withdraw(double amount){
        if(getbalance() >= amount){
            double newBalance = getbalance() - amount;
            setBalance(newBalance);
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current balance: " + getbalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void Addintrest(){
        double time=3;
        double totalIntrest=getbalance()*(Intrestrate/100)*time;
        double newBalance=getbalance()+totalIntrest;
        setBalance(newBalance);
        System.out.println("Total intrest: " + totalIntrest);
        System.out.println("Current balance: " + getbalance());
    }
    void display(){
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: " + getbalance());
        System.out.println("Interest Rate: " + getIntrestrate());
        System.out.println("Total Balance with interest: " + getbalance());
        Addintrest();
    }
        void display2(){
        System.out.println("Current Balance: " + getbalance());
        }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Savingaccount s1 = new Savingaccount(5.0, 0, 5000);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        s1.setAccountNumber(accountNumber);
        s1.display();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        s1.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        s1.withdraw(withdrawAmount);
        s1.display2();
        sc.close();
    }
}