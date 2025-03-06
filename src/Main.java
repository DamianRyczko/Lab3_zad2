import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        ArrayList<Litera> litery= new ArrayList<>(26);
        char litera = 'A';
        for(int i = 0; i < 26; i++){
            litery.add(new Litera(litera));
            litera++;
        }
        IZnajdzImie wyszukiwaczImion = new WyszukiwaczImion();
        if(args.length > 0){
            for(String plik: args){
                try{
                    File tekst = new File(plik);
                    Scanner reader = new Scanner(tekst);
                    while(reader.hasNextLine()){
                        wyszukiwaczImion.znajdzImiona(litery,reader.nextLine(), plik);
                    }
                }
                catch (FileNotFoundException e){
                    System.out.println("Nie znaleziono pliku "+plik);
                    e.printStackTrace();
                }
            }
        }
        else{
            throw new IllegalArgumentException("Nie podano plików");
        }

        for(Litera litera1: litery){
            System.out.println("["+litera1.getLitera()+"]");
            for (Imie imie:litera1.getImiona()){
                System.out.println("\t"+imie.getImie()+":");
                for (Wystapienie wystapienie: imie.getWystapienia()){
                    System.out.println("\t\t"+wystapienie.getNazwaPliku()+", "+wystapienie.getIloscWystapien());
                }
            }
        }
    }
}
