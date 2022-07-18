package it.euris.solid.lsp.sample2.bad;

public class Main {

    public static void main(String[] args) {

        PlayingCard card1 = new PlayingCard();
        CardService cardService = new CardService();

        card1.setRank(1);
        PlayingCard card2 = new PlayingCard();
        card2.setRank(10);

        Joker joker = new Joker();
        System.out.println(cardService.isBetterThan(joker, card2));
        System.out.println(cardService.isBetterThan(card1, card2));

    }

}
