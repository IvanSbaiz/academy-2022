package it.euris.solid.exercise2;

public class Book extends Product implements IReadable, IRentable, ISellable {


    public Book(String title, int price) {
        super(title, price);
    }

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void rent() {
        System.out.println("Rent " + getTitle() + " for " + getPrice() / 2);
    }

    @Override
    public void sell() {
        System.out.println("Sell " + getTitle() + " for " + getPrice());
    }
}
