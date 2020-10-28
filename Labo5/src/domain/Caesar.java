package domain;

public class Caesar implements Strategy {
    char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public Caesar() {

    }

    @Override
    public String codeer(String zin) {
        zin = zin.toLowerCase();
        String codeer = "";

        for (int i = 0; i < zin.length(); i++) {
            boolean found = false;
            for (int j = 0; j < alfabet.length && !found; j++) {
                if (alfabet[j] == (zin.charAt(i))) {
                    found = true;
                    int idx = j + 23;
                    if (idx > 25) {
                        idx = idx - 25;
                    }
                    codeer += alfabet[idx];
                }
            }
        }
        return codeer;
    }

    @Override
    public String decodeer(String zin) {
        zin = zin.toLowerCase();
        String decodeer = "";
        for (int i = 0; i < zin.length(); i++) {
            boolean found = false;
            for (int j = 0; j < alfabet.length && !found; j++) {
                if (alfabet[j] == (zin.charAt(i))) {
                    found = true;
                    int idx = j - 23;
                    if (idx < 0) {
                        idx = idx + 25;
                    }
                    decodeer += alfabet[idx];
                }
            }
        }
        return decodeer;
    }
}
