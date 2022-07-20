package it.euris.patterns.behavioral.observer.sample2;


public interface Observer {
    void update();
}

class MsgPrinter implements Observer {

    private String msg;

    public MsgPrinter(String msg) {
        this.msg = msg;
    }

    @Override
    public void update() {
        System.out.println(this.msg);
    }

}
