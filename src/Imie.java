import java.util.LinkedList;

public class Imie{
    String imie;

    LinkedList<Wystapienie> wystapienia = new LinkedList<>();

    public Imie(String imie) {
        this.imie = imie;
    }

    public void dodajWystapienie (String plik){
        for (Wystapienie wystapienie : wystapienia) {
            if (wystapienie.getNazwaPliku().equals(plik)) {
                wystapienie.setIloscWystapien(wystapienie.getIloscWystapien() + 1);
                return;
            }
        }
        wystapienia.add(new Wystapienie(plik));
    }

    public String getImie() {
        return imie;
    }

    public LinkedList<Wystapienie> getWystapienia() {
        return wystapienia;
    }

    public void setWystapienia(LinkedList<Wystapienie> wystapienia) {
        this.wystapienia = wystapienia;
    }


}
