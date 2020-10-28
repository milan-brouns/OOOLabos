package domain;

public class RandomCypherAdapter implements Strategy {
    RandomCypher randomCypher = new RandomCypher();

    @Override
    public String codeer(String zin) {
        return charNaarZin(randomCypher.encypher(zinNaarChar(zin)));
    }

    @Override
    public String decodeer(String zin) {
        return charNaarZin(randomCypher.decypher(zinNaarChar(zin)));
    }
    private char[] zinNaarChar(String zin){
        char[] res= zin.toCharArray();
        return res;
    }
    private String charNaarZin(char[] chars){
        String res = new String(chars);
        return res;
    }
}