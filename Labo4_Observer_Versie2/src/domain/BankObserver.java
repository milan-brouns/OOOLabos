package domain;

public interface BankObserver {
    public void update(Bankevent e, Rekening2 rekening, double deposit);
}

