package domain;

import java.util.HashMap;
import java.util.*;

public class Bank2 {
    private int nummer = 0;
    private Map<Integer, Rekening2> rekeningen = new HashMap<>();
    private Map<Bankevent, List<BankObserver>> observers = new HashMap<>();

    public Bank2(){
        for(Bankevent e: Bankevent.values()){
            observers.put(e, new ArrayList<>());
        }
    }

    public void addObserver(Bankevent e, BankObserver obs){
        observers.get(e).add(obs);
    }

    public void voegRekeningToe(Rekening2 rekening){
        if(rekening == null){
            throw new IllegalArgumentException("Een rekening mag niet leeg zijn.");
        }
        rekeningen.put(nummer, rekening);
        nummer++;
        notifyObservers(Bankevent.NEW, rekening, 0);
    }

    public void deposit(Rekening2 rekening, double saldo){
        if(!rekeningen.containsValue(rekening)){
            throw new IllegalArgumentException("Dit rekeningnummer bestaat niet");
        }
        rekening.deposit(saldo);
        notifyObservers(Bankevent.DEPOSIT, rekening, saldo);
    }

    public void withdraw(Rekening2 rekening, double saldo){
        if(!rekeningen.containsValue(rekening)){
            throw new IllegalArgumentException("Dit rekeningnummer bestaat niet");
        }
        rekening.withdraw(saldo);
        notifyObservers(Bankevent.WITHDRAW, rekening, saldo);
    }

    public void notifyObservers(Bankevent e, Rekening2 rekening, double deposit){
        for(BankObserver obs: this.observers.get(e)){
            obs.update(e, rekening, deposit);
        }
    }




}