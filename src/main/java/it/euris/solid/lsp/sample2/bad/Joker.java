package it.euris.solid.lsp.sample2.bad;

class Joker extends PlayingCard {
    public int getRank() {
        throw new UnsupportedOperationException();
    }
};