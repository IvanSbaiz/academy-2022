package it.euris.patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        BusinessLogic proxy = new BusinessLogicProxy("admin");
        proxy.process();
    }
}
