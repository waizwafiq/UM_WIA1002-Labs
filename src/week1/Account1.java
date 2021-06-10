package week1;

import java.util.ArrayList;
import java.util.Date;

public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account1(String name) {
        this.name = name;
    }

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public void withdraw(double amount, String desc){
        setBalance(getBalance()-amount);
        Transaction tr = new Transaction(new Date(), 'W', amount, getBalance(), desc);
        transactions.add(tr);
    }

    public void deposit(double amount, String desc){
        setBalance(getBalance()+amount);
        Transaction tr = new Transaction(new Date(), 'D', amount, getBalance(), desc);
        transactions.add(tr);
    }

    public void summary(){
        System.out.println("Name: "+name+"\n"+toString());
        for(Transaction disp:transactions)
            System.out.println(disp.toString());
    }

}

/*TRANSACTION CLASS*/

class Transaction {
    private Date date;
    private char type;
    private double amount, balance;
    private String description;

    public Transaction(Date date, char type, double amount, double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return  "\nDate: " + date +
                "\nType: " + type +
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + description;
    }
}

class Test {
    public static void main(String[] args) {
        Account1 acc = new Account1("Dan",1122, 20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500,"Withdraw! (1)");
        acc.deposit(3000,"Deposit! (1)");
        acc.withdraw(2500,"Withdraw! (2)");
        acc.summary();
    }
}