package it.euris.solid.dip.sample1.bad;

public class Main {

    public static void main(String[] args) {
        Button b = new Button(new Light());
        b.poll();
        b.poll();
    }

}
