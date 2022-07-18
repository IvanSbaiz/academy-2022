package it.euris.solid.lsp.sample2.good;

class Joker extends PlayingCard {
    public int getRank() {
        throw new UnsupportedOperationException();
    }
};