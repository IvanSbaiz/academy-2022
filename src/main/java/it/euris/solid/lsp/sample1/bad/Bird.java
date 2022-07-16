package it.euris.solid.lsp.sample1.bad;

public interface Bird {

    void fly();

}

class Duck implements Bird {

    @Override
    public void fly() {
        System.out.println("I'm a duck and I like to fly");
    }

}

class Kiwi implements Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

}
