package it.euris.solid.exercise2;

import java.util.List;

public class Shelter {

    private List<Product> list;

    public Product getProduct(String title) throws Exception {
        Product productResult = list.stream().filter(currentProduct -> currentProduct.getTitle().equals(title))
                .findFirst().orElse(null);
        if (productResult == null) {
            throw new Exception("Prodotto non trovato");
        }
        list.remove(productResult);
        return productResult;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
