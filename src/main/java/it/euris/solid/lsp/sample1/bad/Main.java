package it.euris.solid.lsp.sample1.bad;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Duck(), new Kiwi()};

        for (Bird bird: birds) {
            if(bird instanceof Kiwi)
                continue;
            bird.fly();
        }
    }

}
