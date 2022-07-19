package it.euris.patterns.structural.decorator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

    private int cost;
    private List<String> descriptions = new ArrayList<>();


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
