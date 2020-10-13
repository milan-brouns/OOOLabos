package domain;

public class Mirror implements Strategy {
    public Mirror() {

    }

    @Override
    public String codeer(String zin) {
        String codeer = "";
        for (int i = zin.length() - 1; i >= 0; i--) {
            codeer += zin.charAt(i);
        }
        return codeer;
    }

    @Override
    public String decodeer(String zin) {
        String decodeer = "";
        for (int i = zin.length() - 1; i >= 0; i--) {
            decodeer += zin.charAt(i);
        }
        return decodeer;
    }
}
