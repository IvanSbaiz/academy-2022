package it.euris.solid.exercise2;

public class DVD extends Product implements IReadable, IRentable {


    public DVD(String title, int price) {
        super(title, price);
    }

    @Override
    public void read() {
        System.out.println("Watching");
    }

    @Override
    public void rent() {
        System.out.println("Rent " + getTitle() + " for " + getPrice() / 2);
    }
}
