package it.euris.solid.exercise1.post;

public abstract class VeicoloABenzina extends Veicolo implements IVeicoloABenzina{

    private int serbatoio = 0;

    @Override
    public void guida() {
        if(controlloRifornimento()){

        setSerbatoio(getSerbatoio() - 1);
        super.guida();
        } else{
            System.out.println("Non ho carburante");
        }
    }

    @Override
    public void rifornimento(int litri) {
        setSerbatoio(getSerbatoio() + litri);
    }

    @Override
    public boolean controlloRifornimento() {
        return getSerbatoio() > 0;
    }

    public int getSerbatoio() {
        return serbatoio;
    }

    public void setSerbatoio(int serbatoio) {
        this.serbatoio = serbatoio;
    }
}
