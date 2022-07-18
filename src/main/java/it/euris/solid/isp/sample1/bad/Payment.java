package it.euris.solid.isp.sample1.bad;

import java.util.List;


public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    //new features
    void intiateLoanSettlement();
    void initiateRePayment();
}

class BankPayment implements Payment {

    @Override
    public void initiatePayments() {

    }

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
        throw new UnsupportedOperationException();
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException();
    }

}


class LoanPayment implements Payment {

    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException();
    }

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