package it.euris.solid.lsp.sample1.good;

public class Main {

    public static void main(String[] args) {
        FlyingBird[] birds = new FlyingBird[]{new Duck()};
        for (FlyingBird bird: birds) {
            bird.fly();
        }
    }

}
