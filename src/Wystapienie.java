public class Wystapienie {
    private String NazwaPliku;
    private int iloscWystapien;

    public Wystapienie(String nazwa) {
        this.NazwaPliku = nazwa;
        this.iloscWystapien = 1;
    }

    public String getNazwaPliku() {
        return NazwaPliku;
    }

    public int getIloscWystapien() {
        return iloscWystapien;
    }

    public void setIloscWystapien(int iloscWystapien) {
        this.iloscWystapien = iloscWystapien;
    }
}
