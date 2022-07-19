package it.euris.patterns.creational.abstract_factory;

public interface Window {
    void show();
}

class WindowsWindow implements Window {
    @Override
    public void show() {
        System.out.println("WIN - Window");
    }
}

class MacWindow implements Window {
    @Override
    public void show() {
        System.out.println("MAC - Window");
    }
}
