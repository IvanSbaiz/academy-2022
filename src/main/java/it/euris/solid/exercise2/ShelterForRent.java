package it.euris.solid.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ShelterForRent extends Shelter{

    public ShelterForRent(List<IRentable> list) {
        List<Product> resultList = new ArrayList<>();
        list.forEach( currentProduct -> resultList.add((Product) currentProduct));
        setList(resultList);
    }

    public void addProduct(IRentable element){
        getList().add((Product) element);
    }

    public IRentable getSellProduct(String title) throws Exception {
        return (IRentable) getProduct(title);
    }

}
