package it.euris.solid.exercise1.post;

public abstract class Veicolo implements IVeicolo{

    private String nome;

    private int ruote;

    private int prezzo;

    @Override
    public void guida() {
        System.out.println(getNome() + " sta guidando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRuote() {
        return ruote;
    }

    public void setRuote(int ruote) {
        this.ruote = ruote;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
