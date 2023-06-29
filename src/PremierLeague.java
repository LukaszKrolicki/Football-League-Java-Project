import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Klasa PremierLeague - reprezentuje angielska lige pilki noznej
 */
public final class PremierLeague extends Liga{
    /**
     *  zmienna przechowyjaca wszytskie rozegrane mecze w lidze
     */
    private ArrayList<Mecz> rozegraneMecze = new ArrayList<>();
    /**
     * zmienna przechowuje wszytskie druzyny danej ligi
     */

    private ArrayList<Klub> listaDruzyn = new ArrayList<>();

    /**
     *
     * @param nazwaRozgrywek   -  nazwa rozgrywek (np. Pilka nozna)
     * @param iloscDruzyn   -   opisuje ilosc druzyn w lidze
     * @param nazwaTrofeum  -  trofeum za zwyciestwo w danej lidze
     * @param liczbaDruzynPremiowanych  -  ilosc druzyn, ktore wchodza do wyzszej ligi
     * @param liczbaDruzynSpadkowych    -   ilosc druzyn, ktore spadaja do nizszej ligi
     * @param listaDruzyn   -   lista druzyn w lidze
     */
    public PremierLeague(String nazwaRozgrywek, Integer iloscDruzyn, String nazwaTrofeum, Integer liczbaDruzynPremiowanych, Integer liczbaDruzynSpadkowych, ArrayList<Klub> listaDruzyn) {
        super(nazwaRozgrywek, iloscDruzyn, nazwaTrofeum, liczbaDruzynPremiowanych, liczbaDruzynSpadkowych);
        this.listaDruzyn = listaDruzyn;
    }

    /**
     *  Funkcja sortujaca tabele ligi, kolejno od najwiekszej ilosci punktow do najmniejszej
     */
    private void sortujlTabele(){
        for(int i = 0; i<listaDruzyn.size()-1; i++){
            for(int j = i+1; j<listaDruzyn.size(); j++){
                if(listaDruzyn.get(i).getLiczbaPunktow()<listaDruzyn.get(j).getLiczbaPunktow()){
                    Collections.swap(listaDruzyn, i, j);
                }
            }
        }
    }

    /**
     *  Funkcja wyswietla tabele ligi
     */
    public void wyswietlTabele(){
        sortujlTabele();
        System.out.println("Oto wyglad obecnej tabeli: ");
        for(Klub k : listaDruzyn){
            System.out.println(k.getNazwaKlubu() + " - l.pkt: " + k.getLiczbaPunktow());
        }
    }

    /**
     *  Funkcja wyswietla druzyny bedace w strefie spadkowej
     */

    public void wyswietlDruzynySpadkowe(){
        System.out.println("Duzyny spadkowe: ");
        for(int i = listaDruzyn.size()-liczbaDruzynSpadkowych; i< listaDruzyn.size(); i++){
            System.out.println(listaDruzyn.get(i).getNazwaKlubu());
        }
    }

    /**
     *  Funkcja wyswietla druzyny w strefie premiowanej
     */
    public void wyswietlDruzynyPremiowane(){
        System.out.println("Druzyny premiowane: ");
        for(int i = 0; i< liczbaDruzynPremiowanych; i++){
            System.out.println(listaDruzyn.get(i).getNazwaKlubu());
        }
    }

    /**
     * Funkcja przyjmuje jako parametr rozegrany mecz, na jego podstawie dodaje punkty do tabeli
     * @param x - rozegrany mecz ligowy
     */
    public void dodajPunkty(Mecz x){
        if(x.getGoleGosci()>x.getGoleGospodarzy()){
            x.getGoscie().setLiczbaPunktow(3);
        } else if (x.getGoleGosci()<x.getGoleGospodarzy()) {
            x.getGospodarze().setLiczbaPunktow(3);
        }
        else {
            x.getGoscie().setLiczbaPunktow(1);
            x.getGospodarze().setLiczbaPunktow(1);
        }
        x.getGospodarze().addRozegraneMecze(x);
        x.getGoscie().addRozegraneMecze(x);
        System.out.println("Dodano punkty");
        rozegraneMecze.add(x);
    }

    /**
     * Funkcja dodaje druzyne do ligi
     * @param x - reprezentuje dodawana druzyne
     */
    public void dodajDruzyne(Klub x){
        if(listaDruzyn.size()<iloscDruzyn){
            listaDruzyn.add(x);
            System.out.println("Dodano klub: "+ x.getNazwaKlubu());
        }
        else{
            System.out.println("Nie mozna dodac klubu");
        }
    }

    /**
     * Funkcja usuwa druzyne z ligi
     * @param x - reprezentuje usuwana druzyne
     */
    public void usunDruzyne(Klub x){
        for(int i=0; i<listaDruzyn.size();i++){
            if(listaDruzyn.get(i).getNazwaKlubu().equals(x.getNazwaKlubu())){
                System.out.println("Usunieto druzyne "+listaDruzyn.get(i).getNazwaKlubu());
                listaDruzyn.remove(i);
                break;
            }
        }
        System.out.println("Nie znaleziono druzyny");
    }
    public void wyswietlRozegraneMecze(){
        System.out.println("Rozegrane mecze: ");
        for(Mecz k : rozegraneMecze){
            System.out.println(k.toString());
        }
    }
    /**
     * Funkcja uzyweana do wypisania wszytskich wartosci atrybowow ligi
     * @return - zwraca String zawierajacy wszystkie wartosci premierleague
     */

    @Override
    public String toString() {
        return "PremierLeague{" +
                "rozegraneMecze=" + rozegraneMecze +
                ", listaDruzyn=" + listaDruzyn +
                ", iloscDruzyn=" + iloscDruzyn +
                ", liczbaDruzynPremiowanych=" + liczbaDruzynPremiowanych +
                ", liczbaDruzynSpadkowych=" + liczbaDruzynSpadkowych +
                '}';
    }
}
