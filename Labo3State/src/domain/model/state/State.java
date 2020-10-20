package domain.model.state;

import domain.model.Product;

public abstract class State {
    Product product;
    public void uitlenen(Product product){
        throw new IllegalStateException("dit object kan niet uitgeleend worden.");
    }
    public void terugbrengen(Product product,Boolean beschadigt){
        throw new IllegalStateException("dit object kan niet terug gebracht worden.");
    }
    public void herstellen(Product product){
        throw new IllegalStateException("Dit object kan niet herstelt worden.");
    }
    public void verwijderen(Product product){
        throw new IllegalStateException("Dit object kan niet verwijderd worden.");
    }
}
