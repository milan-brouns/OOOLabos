package domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Bank extends Observable {
    private Map<String, String> rekeningen;
    private Rekening laatstToegevoegdeRekening;

    public Bank(){
        rekeningen = new HashMap<>();
    }

    public void voegRekeningToe(Rekening rekening){
        rekeningen.put(rekening.getRekeningnummer(), Double.toString(rekening.getSaldo()));
        setLaatstToegevoegdeRekening(rekening);
        bankVeranderd();
    }
    public void verwijderRekening(Rekening rekening){
        rekeningen.remove(rekening.getRekeningnummer(), Double.toString(rekening.getSaldo()));
    }

    public void bankVeranderd(){
        setChanged();
        notifyObservers();
    }
    public Map<String, String> getRekeningen(){
        return rekeningen;
    }

    public Rekening getLaatstToegevoegdeRekening(){
        return laatstToegevoegdeRekening;
    }

    public void setLaatstToegevoegdeRekening(Rekening laatstToegevoegdeRekening){
        this.laatstToegevoegdeRekening = laatstToegevoegdeRekening;
    }
}
