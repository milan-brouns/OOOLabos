package domain;

import java.util.Observable;
import java.util.Observer;

public class RekeningLogger2 implements BankObserver {
    public RekeningLogger2(Bank2 bank){
        bank.addObserver(Bankevent.NEW, this);
        bank.addObserver(Bankevent.DEPOSIT, this);
        bank.addObserver(Bankevent.WITHDRAW, this);
    }
    public void update(Bankevent e, Rekening2 rekening, double saldo){
        System.out.println(e.toString() + ": rekeningnummer: " + rekening.getRekeningnummer() + " €"+ rekening.getSaldo());
    }
}
