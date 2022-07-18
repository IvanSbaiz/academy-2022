package it.euris.solid.exercise2;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        List<ISellable> sellItemForShelter = new ArrayList<>();
        sellItemForShelter.add(new Book( "Cime tempestose", 20));
        sellItemForShelter.add(new Book( "Harry potter 1", 15));
        ShelterForSell shelterForSell = new ShelterForSell(sellItemForShelter);

        List<IRentable> rentItemForShelter = new ArrayList<>();
        rentItemForShelter.add(new Book( "Harry potter 2", 20));
        rentItemForShelter.add(new DVD( "Star wars", 5));
        ShelterForRent shelterForRent = new ShelterForRent(rentItemForShelter);


        List<ISellable> carrelloForSell = new ArrayList<>();
        List<IRentable> carrelloForRent = new ArrayList<>();


        try {
            carrelloForSell.add(shelterForSell.getSellProduct("Cime tempestose"));
            carrelloForRent.add(shelterForRent.getSellProduct("Star wars"));
        }
        catch (Exception ex){

        }


        shopService.buy(carrelloForSell);
        shopService.rent(carrelloForRent);
    }


}
