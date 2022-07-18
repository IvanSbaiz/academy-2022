package it.euris.solid.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ShelterForSell extends Shelter{

    public ShelterForSell(List<ISellable> list) {
        List<Product> resultList = new ArrayList<>();
        list.forEach( currentProduct -> resultList.add((Product) currentProduct));
        setList(resultList);
    }

    public void addProduct(ISellable element){
        getList().add((Product) element);
    }

    public ISellable getSellProduct(String title) throws Exception {
        return (ISellable) getProduct(title);
    }

}
