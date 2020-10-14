package domain.model;

import domain.model.Product;
import domain.model.pricestrategy.OneAndHalfEuroADay;

public class CD extends Product {
    public CD(String id, String titel) {
        super(id, titel);
        priceStrategy =new OneAndHalfEuroADay();
    }
}