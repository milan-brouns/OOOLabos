package domain;

public class Rekening2 {
    private String rekeningnummer;
    private double saldo;

    public Rekening2(String rekeningnummer, double saldo){
        if (rekeningnummer == null && !rekeningnummer.trim().isEmpty()) {
            throw new IllegalArgumentException("Een rekeningnummer kan niet leeg zijn");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Startsaldo moet positief zijn");
        }
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
    }

    public void deposit(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("Saldo moet positief zijn");
        }
        this.saldo += saldo;
    }

    public void withdraw(double saldo) {
        if (saldo <= 0 || saldo > this.saldo) {
            throw new IllegalArgumentException("Saldo moet positief zijn of er staat niet zoveel geld op de rekening");
        }
        this.saldo -= saldo;
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public double getSaldo() {
        return saldo;
    }
}
