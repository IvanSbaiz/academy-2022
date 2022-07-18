package it.euris.solid.lsp.sample1.good;

public interface Bird {

}

interface FlyingBird extends Bird {
    void fly();
}

class BaseFlyingBird implements FlyingBird {

    protected String name;

    @Override
    public void fly() {
        System.out.println("I'm a "+name+" and I like to fly");
    }

}

class Duck extends BaseFlyingBird{
    public Duck() {
        this.name = "duck";
    }
}


class Kiwi implements Bird {

}
