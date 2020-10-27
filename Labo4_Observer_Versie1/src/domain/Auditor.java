package domain;

import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

public class Auditor implements Observer, DisplayElement2 {
    private Bank bank;

    public Auditor(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg){
        if(observable instanceof Bank){
            bank = (Bank) observable;
            display();
        }
    }
    @Override
    public void display(){
        System.out.println("Nieuwe rekening geopend op " + LocalDate.now() +
                " met nummer " + bank.getLaatstToegevoegdeRekening().getRekeningnummer() +
                " en saldo €" + bank.getLaatstToegevoegdeRekening().getSaldo());
    }
}
