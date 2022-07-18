package it.euris.solid.dip.sample1.good;

public class Light implements ButtonServer {
    @Override
    public void on() {
        System.out.println("light on");
    }
    @Override
    public void off() {
        System.out.println("light off");
    }
}
