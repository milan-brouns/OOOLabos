package domain;

import java.util.Observable;
import java.util.Observer;

public class RekeningLogger implements Observer, DisplayElement {
    private Bank bank;

    public RekeningLogger(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg){
        if(observable instanceof Bank){
            bank = (Bank) observable;
            display();
        }
    }

    public void display(){
        System.out.println("Rekeningnummer: " + bank.getLaatstToegevoegdeRekening().getRekeningnummer()
                + "\nAantal rekeningen: " + bank.getRekeningen().size());
    }
}
