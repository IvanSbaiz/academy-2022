package it.euris.solid.lsp.sample2.good;

public class CardService {

    public boolean isBetterThan(RankingCard firstCard, RankingCard secondCard) {
        return firstCard.getRank() > secondCard.getRank();
    }

}
