package it.euris.patterns.creational.factory_method;

public class Main {

    public static void main(String[] args) {
        VehicleFactory vf = VehicleFactoryDefault.getInstance();
        Vehicle v = vf.getVehicle(4);
    }

}
