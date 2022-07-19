package it.euris.patterns.structural.decorator.exercise;

public class Main {

    public static void main(String[] args) {
        IKitchen currentKitchen = new KitchenBasic();
        currentKitchen = new KitchenWithFridge(currentKitchen);
        currentKitchen = new KitchenWithOven(currentKitchen);
        currentKitchen = new IKitchenDecorator(currentKitchen);
        System.out.println((currentKitchen.getKitchen().getCost()));

    }

}
