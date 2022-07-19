package it.euris.patterns.creational.abstract_factory;

public interface Button {
    void show();
}

class WindowsButton implements Button{

    @Override
    public void show() {
        System.out.println("WIN - button");
    }

}

class MacButton implements Button{

    @Override
    public void show() {
        System.out.println("MAC - button");
    }
}