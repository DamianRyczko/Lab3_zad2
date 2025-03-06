import java.util.LinkedList;


public class Litera {
    private char litera;
    LinkedList<Imie> imiona = new LinkedList<>();

    public Litera(char litera) {
        this.litera = litera;
    }

    public char getLitera() {
        return litera;
    }
    public void dodajImie(String imie, String plik){
        for (Imie imie1 : imiona) {
            if (imie.equals(imie1.getImie())) {
                imie1.dodajWystapienie(plik);
                return;
            }
        }
        Imie noweImie = new Imie(imie);
        noweImie.dodajWystapienie(plik);

        int index = 0;
        for (; index < imiona.size(); index++) {
            if (imiona.get(index).getImie().compareTo(imie) > 0) { // >0  = alfabetycznie rosnąca (od A do Z); 0< = alfabetycznie malejąca
                break;
            }
        }

        imiona.add(index, noweImie);
    }
    public LinkedList<Imie> getImiona() {
        return imiona;
    }

    public void setImiona(LinkedList<Imie> imiona) {
        this.imiona = imiona;
    }
}
