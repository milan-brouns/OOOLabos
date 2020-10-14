package domain.model.pricestrategy;

import domain.PriceStrategy;

public class OneAndHalfEuroADay implements PriceStrategy {
    @Override
    public double getPrice(int days) {
        return 1.5*days;
    }
}