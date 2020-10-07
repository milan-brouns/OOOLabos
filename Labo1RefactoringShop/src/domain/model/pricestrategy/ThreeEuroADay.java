package domain.model.pricestrategy;

import domain.PriceStrategy;

public class ThreeEuroADay implements PriceStrategy {
    @Override
    public double getPrice(int days) {
        return 3*days;
    }
}