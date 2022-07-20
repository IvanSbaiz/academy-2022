package it.euris.patterns.behavioral.observer.sample1;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void register(Observer ob);
    void unregister(Observer ob);

    void notifyObs(String news);
}

class NewsAgency implements Subject {

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
    public void notifyObs(String news) {
        for (Observer ob: obs) {
            ob.update(news);
        }
    }

//    public void releaseNews(String news){
//        System.out.println("Breaking news: "+news);
//        notifyObs();
//    }

}