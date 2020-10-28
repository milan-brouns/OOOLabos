package domain;


public class Auditor2 implements BankObserver {
    public Auditor2(Bank2 bank){
        bank.addObserver(Bankevent.NEW, this);
    }
    public void update(Bankevent e, Rekening2 rekening, double deposit){
        System.out.println("Nieuwe rekening geopend: " + rekening.getRekeningnummer());
    }

}
