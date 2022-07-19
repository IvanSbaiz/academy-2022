package it.euris.patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Computer c = new Computer.ComputerBuilder("32GB", "8TB", "XYZ")
                .bluetooth(false)
                .build();

        Computer c2 = new Computer.ComputerBuilder("32GB", "8TB", "XYZ")
                .mouse("my mouse")
                .build();

        //System.out.println(c2.getBluetooth());
    }
}
