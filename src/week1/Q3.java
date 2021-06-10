package week1;

import java.util.Date;

class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;

    public Account(){
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }


    //ACCESSORS
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    //MUTATORS
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //OTHER METHODS
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return (getMonthlyInterestRate()/100)*balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                "\nBalance: " + balance +
                "\nMonthly Interest Rate: " + annualInterestRate +
                "\nDate Created: " + dateCreated;
    }
}

class Tester {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println(acc.toString());
    }
}