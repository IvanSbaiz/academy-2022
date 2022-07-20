package it.euris.patterns.behavioral.command.sample2;

public class Account {

    private int summaryValue;

    public Account(int summaryValue){
        this.summaryValue = summaryValue;
    }

    public void withdraw(int amount) {
        summaryValue = summaryValue - amount;
        System.out.println("Withdraw " + amount);
    }

    public void deposit(int amount) {
        summaryValue = summaryValue + amount;
        System.out.println("Deposit " + amount);
    }

    public int getSummaryValue() {
        return summaryValue;
    }

    public void setSummaryValue(int summaryValue) {
        this.summaryValue = summaryValue;
    }
}