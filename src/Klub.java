import java.util.ArrayList;
import java.util.List;

/**
 * Klub - reprezentuje klub piłkarski
 */

public class Klub implements KlubOperacje{

    private String nazwaKlubu;
    private Integer liczbaPunktow;
    private List<Mecz> rozegraneMecze = new ArrayList<>();

    private List<Zawodnik> zawodnicy = new ArrayList<>();

    private Trener trener;

    private String stadion;

    private Integer kapital;

    /**
     *
     * @param nazwaKlubu - zawiera Nazwę klubu
     * @param liczbaPunktow - liczba punktów drużyny w lidze
     * @param zawodnicy - aktualnie zatrudnieni zawodnicy
     * @param trener - aktualnie zatrudniony trener
     * @param stadion - stadion klubu
     * @param kapital - dostepne srodki finansowe klubu
     */
    public Klub(String nazwaKlubu, Integer liczbaPunktow, List<Zawodnik> zawodnicy, Trener trener, String stadion,Integer kapital) {
        this.nazwaKlubu = nazwaKlubu;
        this.liczbaPunktow = liczbaPunktow;
        this.zawodnicy = zawodnicy;
        this.trener = trener;
        this.stadion = stadion;
        this.kapital=kapital;
    }

    /**
     * Funkcja przelicza kwote w funtach na PLN
     * @param kwotaFunty - kwota w funtach
     * @return zwraca kwotę przeliczona na PLN
     */
    public static double przeliczNaPLN(double kwotaFunty){ //przelicza kwotę z GBP na PLN
        return kwotaFunty * 5.22;
    }


    @Override
    public void zatrudnijZawodnika(Zawodnik x, Integer id) {
        zawodnicy.add(x);
        System.out.println("Zatrudniono zawodnika o  ID "+ id);
        x.setIdZawodnika(id);
    }

    @Override
    public void zwolnijZawonika(Integer id) {
        Integer miejsceWliscie=znajdzZawodnika(id);
        if(miejsceWliscie!=-1){
            zawodnicy.remove(miejsceWliscie);
            System.out.println("Zwolniono zawodnika o ID "+ id);
        }
        else{
            System.out.println("Nie ma takiego zawodnika na liscie");
        }

    }

    @Override
    public void zwiekszZarobkiZawodnika(Integer id, Integer ile) {
        Integer miejsceWliscie=znajdzZawodnika(id);
        if(miejsceWliscie!=-1){
            zawodnicy.get(miejsceWliscie).setZarobkiTygodniowePlus(ile);
            System.out.println("Zwiekszono zarobki zawodnikowi o ID "+ id + " o kwote " + ile);
        }
        else{
            System.out.println("Nie ma takiego zawodnika na liscie");
        }
    }

    @Override
    public void zmniejszZarobkiZawodnika(Integer id, Integer ile) {
        Integer miejsceWliscie=znajdzZawodnika(id);
        if(miejsceWliscie!=-1){
            if(zawodnicy.get(miejsceWliscie).getZarobkiTygodniowe()>=ile){
                zawodnicy.get(miejsceWliscie).setZarobkiTygodnioweMinus(ile);
                System.out.println("Zmniejszono zarobki zawodnikowi o ID "+ id + " o kwote " + ile);
            }
            else{
                System.out.println("Bez przesady");
            }
        }
        else{
            System.out.println("Nie ma takiego zawodnika na liscie");
        }
    }

    @Override
    public void wyplataZawodnikowi(Integer id) {
        Integer miejsceWliscie=znajdzZawodnika(id);
        if(miejsceWliscie!=-1){
            if(kapital>=zawodnicy.get(miejsceWliscie).getZarobkiTygodniowe()){
                System.out.println("Wyplacono " + zawodnicy.get(miejsceWliscie).getZarobkiTygodniowe());
                kapital-=zawodnicy.get(miejsceWliscie).getZarobkiTygodniowe();
            }
        }
        else{
            System.out.println("Nie ma takiego zawodnika na liscie");
        }

    }

    /**
     * Funkcja pomocnicza sluzaca do znajdowania zawodnika na liscie
     * @param id - id szukanego zawodnika
     * @return pozycja zawodnika na liście zawodników, w przeciwnym wypadku -1
     */
    private Integer znajdzZawodnika(Integer id){
        for(int i=0; i<zawodnicy.size();i++){
            if(zawodnicy.get(i).getIdZawodnika().equals(id)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Funckja wyświetlająca wszystkich obecnie zakontraktowanych zawodników
     */
    public void wyswietlZawodnikow(){
        System.out.println("Aktualnie zakaontraktowani zawodnicy: ");
        for(int i=0; i<zawodnicy.size();i++){
            zawodnicy.get(i).wyswetilImieNazwisko();
        }
    }

    /**
     * Funkcja wyświetkająca wszystkie rozegrane mecze
     */
    public void wyswietlRozegraneMecze(){
        System.out.println("Rozegrane mecze: ");
        for(Mecz k : rozegraneMecze){
            System.out.println(k.toString());
        }
    }

    /**
     * Funkcja zwracająca stadion klubu
     * @return stadion Klubu
     */
    public String getStadion() {
        return stadion;
    }

    /**
     * Funkcja zwracająca nazwe klubu
     * @return nazwa klubu
     */
    public String getNazwaKlubu() {
        return nazwaKlubu;
    }

    /**
     * Funckja dodająca punkty do licznika w tabeli
     * @param liczbaPunktow - reprezentuje liczbe punktow do dodania
     */
    public void setLiczbaPunktow(Integer liczbaPunktow) {
        this.liczbaPunktow += liczbaPunktow;
    }

    /**
     * Funkcja zwraca liczbe punktow
     * @return liczba punktow
     */
    public Integer getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public void addRozegraneMecze(Mecz x) {
        this.rozegraneMecze.add(x);
    }

    /**
     * Funkcja zwraca wszystkie informacje oklubie
     */
    @Override
    public String toString() {
        return "Klub{" +
                "nazwaKlubu='" + nazwaKlubu + '\'' +
                ", liczbaPunktow=" + liczbaPunktow +
                ", rozegraneMecze=" + rozegraneMecze +
                ", zawodnicy=" + zawodnicy +
                ", trener=" + trener +
                ", stadion='" + stadion + '\'' +
                ", kapital=" + kapital +
                '}';
    }


}
