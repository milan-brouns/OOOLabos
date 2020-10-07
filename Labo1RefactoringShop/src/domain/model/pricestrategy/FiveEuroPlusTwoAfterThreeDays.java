package domain.model.pricestrategy;

public class FiveEuroPlusTwoAfterThreeDays implements domain.PriceStrategy {
    @Override
    public double getPrice(int days) {
        int daysleft = days-3;
        if (daysleft>0){
            return 5 + (2*daysleft);
        }else return 5;
    }
}
