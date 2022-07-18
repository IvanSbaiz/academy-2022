package it.euris.solid.lsp.sample2.good;

public class Main {

    public static void main(String[] args) {

        RankingCard card1 = new RankingCard();
        CardService cardService = new CardService();

        card1.setRank(1);
        RankingCard card2 = new RankingCard();
        card2.setRank(10);

        Joker joker = new Joker();
//        System.out.println(cardService.isBetterThan(joker, card2));
        System.out.println(cardService.isBetterThan(card1, card2));

    }

}
