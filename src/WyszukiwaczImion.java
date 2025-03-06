import java.util.ArrayList;

public class WyszukiwaczImion implements IZnajdzImie{
    @Override
    public void znajdzImiona(ArrayList<Litera> literyWejscie, String dane, String plik){
        ArrayList<Litera> litery = literyWejscie;
        String[] rodzieloneDane = dane.split(" ");
        for (String slowo : rodzieloneDane) {
            String slowoCzyste = slowo.replaceAll("[,\\.!?'\"&@;:/]", "");
            for (Imiona imie : Imiona.values()) {
                if (imie.matches(slowoCzyste)) {
                    for(Litera litera1 : litery){
                        if (slowoCzyste.charAt(0) == litera1.getLitera()){
                            litera1.dodajImie(imie.getNieodmienione(), plik);
                        }
                    }
                }
            }
        }
    }
}
