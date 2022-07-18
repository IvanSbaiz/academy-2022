package it.euris.solid.dip.sample1.good;

public class SimpleButton implements Button {

    private ButtonServer buttonServer;
    private boolean on;

    public SimpleButton(ButtonServer buttonServer) {
        this.buttonServer = buttonServer;
    }

    @Override
    public void poll() {
        boolean checkOn = isOn();
        if (checkOn) {
            this.buttonServer.off();
            this.on = false;
        } else {
            this.buttonServer.on();
            this.on = true;
        }
    }

    public boolean isOn() {
        return this.on;
    }

}
