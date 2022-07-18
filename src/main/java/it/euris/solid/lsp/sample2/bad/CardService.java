package it.euris.solid.lsp.sample2.bad;

public class CardService {

    public boolean isBetterThan(PlayingCard firstCard, PlayingCard secondCard) {
        return firstCard.getRank() > secondCard.getRank();
    }

}
