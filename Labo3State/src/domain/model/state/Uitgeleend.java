package domain.model.state;

import domain.model.Product;

public class Uitgeleend extends State {

    public Uitgeleend (Product product){
        this.product =product;
    }

    @Override
    public void terugbrengen(Product product, Boolean beschadigt) {
        if (beschadigt==true){
            product.setState(product.getBeschadigdState());
        }else {
            product.setState(product.getUitleenbaarState());
        }
    }
}
