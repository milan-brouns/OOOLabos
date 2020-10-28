package domain;

public class Vertaling {
    private Strategy strategy;

    public Vertaling() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String codeer(String zin){
        return strategy.codeer(zin);
    }

    public String decodeer(String zin){
        return strategy.decodeer(zin);
    }
}
