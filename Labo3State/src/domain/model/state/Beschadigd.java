package domain.model.state;

import domain.model.Product;

public class Beschadigd extends State {

    public Beschadigd(Product product) {
        this.product = product;
    }

    @Override
    public void herstellen(Product product) {
        product.setState(product.getUitleenbaarState());
    }

    @Override
    public void verwijderen(Product product) {
        product.setState(product.getVerwijderdState());
    }
}

