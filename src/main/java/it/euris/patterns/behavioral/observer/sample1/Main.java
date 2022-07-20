package it.euris.patterns.behavioral.observer.sample1;

public class Main {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Observer rai1 = new NewsChannel("Rai 1");
        Observer rai2 = new NewsChannel("Rai 2");

        agency.register(rai1);
        agency.register(rai2);
        agency.notifyObs("Abbiamo vinto i mondiali");
    }

}
