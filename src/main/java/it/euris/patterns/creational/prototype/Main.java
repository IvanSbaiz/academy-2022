package it.euris.patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Employees prototipoBase = new Employees();
        prototipoBase.load();

        Employees simulazione1 = (Employees) prototipoBase.clone();
        simulazione1.load();


        System.out.println(prototipoBase);
        System.out.println(simulazione1);

    }

}
