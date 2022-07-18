package it.euris.solid.dip.sample1.good;

public interface Button {
    void poll();
}

interface ButtonServer {
    void on();
    void off();
}
