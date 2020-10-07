package domain.model;

import domain.Product;
import domain.model.pricestrategy.ThreeEuroADay;

public class Game extends Product {

    public Game(String id, String titel) {
        super(id, titel);
        priceStrategy = new ThreeEuroADay();
    }
}
