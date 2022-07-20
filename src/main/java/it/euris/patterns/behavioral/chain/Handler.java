package it.euris.patterns.behavioral.chain;

public interface Handler {
    void handle(int i);
}

class Handle10 implements Handler {

    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(int i) {
        if (i < 10) {
            System.out.println("A::handle");
        } else {
            System.out.println("A::next");
            handler.handle(i);
        }
    }

}

class Handle50 implements Handler {

    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(int i) {
        if (i < 50) {
            System.out.println("B::handle");
        } else {
            System.out.println("B::next");
            handler.handle(i);
        }
    }
}

class AlwaysHandle implements Handler {

    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(int i) {
        System.out.println("C::handle");
    }

}


class Main {

    public static void main(String[] args) {
        Handle10 handle10 = new Handle10(); //0
        Handle50 handle50 = new Handle50(); //1

        AlwaysHandle alwaysHandle = new AlwaysHandle(); //2

        // chain of responsibility
        handle10.setHandler(handle50);
        handle50.setHandler(alwaysHandle);

        client(handle10);
    }

    private static void client(Handler h) {
//        h.handle(5);
//        h.handle(15);
        h.handle(55);
    }

}
