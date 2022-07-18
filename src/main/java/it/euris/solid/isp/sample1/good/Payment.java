package it.euris.solid.isp.sample1.good;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayments();
}

interface Bank extends Payment {
    void initiatePayments();
}

interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}

class BankPayment implements Bank {

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void initiatePayments() {

    }
}

class LoanPayment implements Loan {

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void intiateLoanSettlement() {

    }

    @Override
    public void initiateRePayment() {

    }

}