package it.euris.solid.dip.sample1.good;

public class Main {

    public static void main(String[] args) {
        SimpleButton lightButton = new SimpleButton(new Light());
        lightButton.poll();
        lightButton.poll();
        SimpleButton tvButton = new SimpleButton(new Tv());
        tvButton.poll();
        tvButton.poll();
    }

}
