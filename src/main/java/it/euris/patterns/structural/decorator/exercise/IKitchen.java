package it.euris.patterns.structural.decorator.exercise;

public interface IKitchen {

    Kitchen getKitchen();

}

class KitchenBasic implements IKitchen {

    @Override
    public Kitchen getKitchen() {
        return new Kitchen();
    }

}

class IKitchenDecorator implements IKitchen {

    private IKitchen IKitchen;

    public IKitchenDecorator(IKitchen IKitchen) {
        this.IKitchen = IKitchen;
    }

    @Override
    public Kitchen getKitchen() {
        return IKitchen.getKitchen();
    }
}

class KitchenWithFridge extends IKitchenDecorator {

    public KitchenWithFridge(IKitchen IKitchen) {
        super(IKitchen);
    }

    @Override
    public Kitchen getKitchen() {
        Kitchen kitchen = super.getKitchen();
        kitchen.setCost(kitchen.getCost() + 20);
        kitchen.getDescriptions().add("Fridge");
        return kitchen;
    }

}

class KitchenWithOven extends IKitchenDecorator {

    public KitchenWithOven(IKitchen IKitchen) {
        super(IKitchen);
    }

    @Override
    public Kitchen getKitchen() {
        Kitchen kitchen = super.getKitchen();
        kitchen.setCost(kitchen.getCost() + 50);
        kitchen.getDescriptions().add("Oven");
        return kitchen;

    }

}
