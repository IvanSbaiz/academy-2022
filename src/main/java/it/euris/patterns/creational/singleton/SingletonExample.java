package it.euris.patterns.creational.singleton;

public class SingletonExample {

    private static final SingletonExample instance = new SingletonExample();

    private SingletonExample(){}

    public static SingletonExample getInstance(){
        return instance;
    }

}
