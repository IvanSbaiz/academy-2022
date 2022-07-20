package it.euris.patterns.behavioral.observer.exercise;


import java.util.ArrayList;
import java.util.List;

public class OrderSubject implements IOrderSubject {

    private static OrderSubject instance = new OrderSubject();
    private OrderSubject(){}

    public static OrderSubject getInstance(){
        return instance;
    }


    private List<IOrderObserver> obs = new ArrayList<>();

    @Override
    public void register(IOrderObserver ob) {
        obs.add(ob);
    }

    @Override
    public void unregister(IOrderObserver ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObs() {
        for (IOrderObserver ob: obs) {
            ob.updateState();
        }
    }
}
