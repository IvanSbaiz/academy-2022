package it.euris.patterns.creational.abstract_factory;

public interface Slider {
    void show();
}

class WindowsSlider implements Slider {

    @Override
    public void show() {
        System.out.println("WIN - slider");
    }

}

class MacSlider implements Slider {

    @Override
    public void show() {
        System.out.println("MAC - slider");
    }

}