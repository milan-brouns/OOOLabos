package domain.model;

import domain.model.state.*;

public abstract class Product {
    private String id, titel;
    protected domain.PriceStrategy priceStrategy;
    protected State state;
    Uitleenbaar uitleenbaar =new Uitleenbaar(this);
    Uitgeleend uitgeleend = new Uitgeleend(this);
    Beschadigd beschadigd = new Beschadigd(this);
    Verwijderd verwijderd = new Verwijderd(this);


    public Product(String id, String titel) {
        this.id = id;
        this.titel = titel;
        state = uitleenbaar;
    }

    public String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setPriceStrategy(domain.PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double getPrice (int days){
        return priceStrategy.getPrice(days);
    }
}
