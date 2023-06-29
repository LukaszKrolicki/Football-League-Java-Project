import java.util.ArrayList;

/**
 * Zawodnik - reprezentuje pilkarza
 */
public class Zawodnik extends  Osoba {

    private String pozycja;

    private double wzrost;
    private Integer zarobkiTygodniowe;

    private Integer liczbaGoli;

    private Integer idZawodnika;

    /**
     * Konstruktor Zawodnika
     * @param imie  - imie zawodnika
     * @param nazwisko - nazwisko zawodnika
     * @param wiek  - wiek zawodnika
     * @param pozycja - pozycja na ktorej gra zawodnik
     * @param wzrost - wzrost zawodnika
     * @param zarobkiTygodniowe - zarobki tygodniowe zawodnika
     * @param liczbaGoli - liczba goli jakie zdobyl zawodnik w karierze
     */
    public Zawodnik(String imie, String nazwisko, Integer wiek, String pozycja, double wzrost, Integer zarobkiTygodniowe, Integer liczbaGoli) {
        super(imie, nazwisko, wiek);
        this.pozycja = pozycja;
        this.wzrost = wzrost;
        this.zarobkiTygodniowe = zarobkiTygodniowe;
        this.liczbaGoli = liczbaGoli;
    }

    /**
     * Przeciazony konstruktor Zawodnika zawierajacy jego id
     * @param idZawodnika - id zawodnika
     */
    public Zawodnik(String imie, String nazwisko, Integer wiek, String pozycja, double wzrost, Integer zarobkiTygodniowe, Integer liczbaGoli, Integer idZawodnika) { //przeciazenie
        super(imie, nazwisko, wiek);
        this.pozycja = pozycja;
        this.wzrost = wzrost;
        this.zarobkiTygodniowe = zarobkiTygodniowe;
        this.liczbaGoli = liczbaGoli;
        this.idZawodnika=idZawodnika;
    }

    /**
     * Funkcja ustawiajaca id zawodnika
     * @param idZawodnika
     */
    public void setIdZawodnika(Integer idZawodnika) {
        this.idZawodnika = idZawodnika;
    }

    /**
     * Funkcja zwiekszajaca zarobki tygodniowe zawodnika
     * @param zarobkiTygodniowe
     */
    public void setZarobkiTygodniowePlus(Integer zarobkiTygodniowe) {
        this.zarobkiTygodniowe += zarobkiTygodniowe;
    }

    /**
     * Funkcja zmniejszajaca zarobki tygodniowe zawodnika
     * @param zarobkiTygodniowe
     */
    public void setZarobkiTygodnioweMinus(Integer zarobkiTygodniowe) {
        this.zarobkiTygodniowe -= zarobkiTygodniowe;
    }

    /**
     * Funckcja zwracajaca zarobki tygodniowe zawodnika
     * @return zarobki zawodnika
     */
    public Integer getZarobkiTygodniowe() {
        return zarobkiTygodniowe;
    }

    /**
     * Funkcja zwracajaca id zawodnika
     * @return id zawodnika
     */
    public Integer getIdZawodnika() {
        return idZawodnika;
    }

    /**
     * Funkcja wyswietla imie zawodnika
     */
    public void wyswetilImieNazwisko(){
        System.out.println(imie + " " + nazwisko);
    }

    /**
     * Funkcja dodaje gola zawodnikowi
     */
    public void dodajGola(){
        liczbaGoli++;
    }

    /**
     * Klasa wewnetrzna zawierajaca opis atrubutow oraz osiagniecia zawodnika
     */
    class OpisZawodnika{ //klasa wewnętrzna
        private ArrayList<String> atrybutyZawodnika = new ArrayList<>();;
        private ArrayList<String> osiagniecia = new ArrayList<>();

        /**
         * Konstruktor opisu zawodnika
         * @param atrybutyZawodnika - cechy zawodnika
         * @param osiagniecia - dotychczasowe osiagniecia
         */
        public OpisZawodnika(ArrayList<String> atrybutyZawodnika, ArrayList<String> osiagniecia) {
            this.atrybutyZawodnika = atrybutyZawodnika;
            this.osiagniecia = osiagniecia;
        }

        /**
         * Funkcja dodaje osiagniecia do listy osiągniec
         * @param osiagniecie - osiagniecie do dodania
         */
        public void setOsiagniecia(String osiagniecie) {
            this.osiagniecia.add(osiagniecie);
        }

        /**
         * Funkcja dodaje atrybuty do zawodnika
         * @param atrybutyZawodnika - atrybut do dodania
         */
        public void setAtrybutyZawodnika(String atrybutyZawodnika) {
            this.atrybutyZawodnika.add(atrybutyZawodnika);
        }

        /**
         * Funnkcja wyswietlajaca opis zawodnika
         */
        public void wyswietlOpis(){
            System.out.println("Dane zawodnika: ");
            System.out.println("-Imie nazwisko: "+imie+" "+nazwisko);
            System.out.println("-Wzrost: "+wzrost);
            System.out.println("-Pozycja: "+pozycja);
            System.out.println("-Liczba goli w tym sezonie: "+liczbaGoli);
            System.out.println("-Zarobki: "+zarobkiTygodniowe);
            System.out.println("Osiagnidcia zawodnika: ");
            for(String k : osiagniecia){
                System.out.println("- "+ k);
            }
            System.out.println("Wady i zalety zawodnika: ");
            for(String k : atrybutyZawodnika){
                System.out.println("- "+ k);
            }
        }
    }

    /**
     * Funkcja zwracajaca informacje o zawodniku
     * @return zwraca info o zawodniku
     */
    @Override
    public String toString() {
        return "Zawodnik{" +
                "pozycja='" + pozycja + '\'' +
                ", wzrost=" + wzrost +
                ", zarobkiTygodniowe=" + zarobkiTygodniowe +
                ", liczbaGoli=" + liczbaGoli +
                ", idZawodnika=" + idZawodnika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
