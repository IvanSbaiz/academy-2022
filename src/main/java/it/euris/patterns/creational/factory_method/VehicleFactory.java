package it.euris.patterns.creational.factory_method;

public interface VehicleFactory {

    Vehicle getVehicle(int wheels);
}

class VehicleFactoryDefault implements VehicleFactory {

    private static VehicleFactoryDefault instance;

    private VehicleFactoryDefault(){}

    public static VehicleFactoryDefault getInstance(){
        if(instance == null){
            instance = new VehicleFactoryDefault();
        }
        return instance;
    }

    @Override
    public Vehicle getVehicle(int wheels) {
        switch (wheels) {
            case 2:
                return new Motorbike();
            case 4:
                return new Car();
            case 6:
                return new Truck();
            default:
                throw new RuntimeException("fail");
        }
    }

}
