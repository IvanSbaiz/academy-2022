package it.euris.solid.exercise2;

import java.util.List;

public class ShopService {

    public void buy(List<ISellable> productList){
        productList.forEach( product ->  product.sell());
    }

    public void rent(List<IRentable> productList){
        productList.forEach( product ->  product.rent());
    }
}
