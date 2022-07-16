package it.euris.solid.dip.sample1.bad;

public class Button {

    private Light light;
    private boolean on;

    public Button(Light light) {
        this.light = light;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void poll() {
        boolean checkOn = isOn();
        if (checkOn) {
            light.turnOff();
            this.on = false;
        } else {
            light.turnOn();
            this.on = true;
        }
    }

}


