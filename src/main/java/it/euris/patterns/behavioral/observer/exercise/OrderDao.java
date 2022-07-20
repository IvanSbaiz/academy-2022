package it.euris.patterns.behavioral.observer.exercise;

public class OrderDao implements IOrderObserver {

    private boolean finish;

    @Override
    public void updateState() {
        finish = true;
    }

    public void updateDB() {
        if (finish) {
            return;
        }
        System.out.println("UpdateDB");
    }
}
