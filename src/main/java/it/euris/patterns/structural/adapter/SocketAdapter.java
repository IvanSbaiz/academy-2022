package it.euris.patterns.structural.adapter;

public interface SocketAdapter {

    Volt get240Volt();
    Volt get12Volt();
    Volt get3Volt();

}

class SocketClassAdapter extends Socket implements SocketAdapter {

    @Override
    public Volt get240Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convert(getVolt(), 20);
    }

    @Override
    public Volt get3Volt() {
        return convert(getVolt(), 80);
    }

    private Volt convert(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }

}

class SocketObjectAdapter implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get240Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convert(socket.getVolt(), 20);
    }

    @Override
    public Volt get3Volt() {
        return convert(socket.getVolt(), 1);
    }

    private Volt convert(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }

}