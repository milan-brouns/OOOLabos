package domain;

public class Rekening {
    private String rekeningnummer;
    private double saldo;

    public Rekening(String rekeningnummer, double saldo){
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
    }

    public String getRekeningnummer(){
        return rekeningnummer;
    }

    public double getSaldo(){
        return saldo;
    }
}
