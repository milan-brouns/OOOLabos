package domain.model.state;

import domain.model.Product;

public class Uitleenbaar extends State {

    public Uitleenbaar(Product product) {
        this.product =product;

    }

    @Override
    public void uitlenen(Product product) {

    }
}
