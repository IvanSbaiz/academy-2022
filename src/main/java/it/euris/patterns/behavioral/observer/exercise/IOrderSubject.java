package it.euris.patterns.behavioral.observer.exercise;

public interface IOrderSubject {

    void register(IOrderObserver observer);
    void unregister(IOrderObserver observer);
    void notifyObs();
}
