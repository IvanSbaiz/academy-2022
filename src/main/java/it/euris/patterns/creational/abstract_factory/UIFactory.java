package it.euris.patterns.creational.abstract_factory;

public interface UIFactory {

    Button buildButton();
    Slider buildSlider();
    Window buildWindow();

}

class UIFactoryWindows implements UIFactory {

    @Override
    public Button buildButton() {
        return new WindowsButton();
    }

    @Override
    public Slider buildSlider() {
        return new WindowsSlider();
    }

    @Override
    public Window buildWindow() {
        return new WindowsWindow();
    }

}

class UIFactoryMac implements UIFactory {

    @Override
    public Button buildButton() {
        return new MacButton();
    }

    @Override
    public Slider buildSlider() {
        return new MacSlider();
    }

    @Override
    public Window buildWindow() {
        return new MacWindow();
    }

}