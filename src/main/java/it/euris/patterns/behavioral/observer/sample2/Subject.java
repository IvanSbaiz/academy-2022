package it.euris.patterns.behavioral.observer.sample2;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void register(Observer ob);
    void unregister(Observer ob);
    void notifyObs();
}

class Button implements Subject {

    private List<Observer> obs = new ArrayList<>();

    @Override
    public void register(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObs() {
        for (Observer ob: obs) {
            ob.update();
        }
    }

    public void push(){
        System.out.println("Button pressed");
        notifyObs();
    }

}