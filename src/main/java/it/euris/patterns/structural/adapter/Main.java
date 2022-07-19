package it.euris.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketObjectAdapter();
        SocketAdapter socketAdapter2 = new SocketClassAdapter();
        Volt v3 = socketAdapter.get3Volt();
        Volt secondv3 = socketAdapter2.get3Volt();

        System.out.println(v3.getVolts());
        System.out.println(secondv3.getVolts());
    }

}
