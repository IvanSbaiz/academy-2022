package it.euris.solid.dip.sample1.good;

public class Tv implements ButtonServer {
    @Override
    public void on() {
        System.out.println("tv on");
    }
    @Override
    public void off() {
        System.out.println("tv off");
    }
}
