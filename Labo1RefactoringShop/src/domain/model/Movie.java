package domain.model;

import domain.model.Product;
import domain.model.pricestrategy.FiveEuroPlusTwoAfterThreeDays;

public class Movie extends Product {

    public Movie(String id, String titel) {
        super(id, titel);
        priceStrategy = new FiveEuroPlusTwoAfterThreeDays();
    }
}
