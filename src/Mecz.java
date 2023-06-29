import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentujaca mecz
 */
public class Mecz {
    /**
     * zmienna reprezentuje druzyne gospodarzy
     */
    private Klub gospodarze;
    /**
     * zmienna reprezentuje druzyne gosci
     */
    private Klub goscie;
    /**
     * zmienna reprezentujaca ilosc goli zdobytych przez gospodarzy
     */
    private Integer goleGospodarzy;
    /**
     * zmienna reprezentujaca ilosc goli zdobytych przez gosci
     */
    private Integer goleGosci;
    /**
     * zmienna reprezentuje stadion na ktorym rozgrywany jest mecz
     */
    private String Stadion;
    /**
     * zmienna zawierajaca liste strzelcow dla gospodarzy
     */
    private List<Zawodnik> strzelcyGospodarzy = new ArrayList<>();
    /**
     * zmienna zawierajaca liste strzelcow dla gosci
     */
    private List<Zawodnik> strzelcyGosci = new ArrayList<>();
    /**
     * zmienna reprezentuje zawodnika meczu
     */
    private Zawodnik mvp;

    /**
     *
     * @param gospodarze - druZyna gospodarzy
     * @param goscie - druZyna goSci
     * @param goleGospodarzy - gole strzelone przez druzyne gospodarzy
     * @param goleGosci - gole strzelone przez duzynę gosci
     * @param stadion - stadion gospodarzy
     * @param strzelcyGospodarzy - strzelcy gospodarzy
     * @param strzelcyGosci - strzelcy gosci
     * @param mvp - najlepszy gracz meczu
     */
    public Mecz(Klub gospodarze, Klub goscie, Integer goleGospodarzy, Integer goleGosci, String stadion, List<Zawodnik> strzelcyGospodarzy, List<Zawodnik> strzelcyGosci, Zawodnik mvp) {
        this.gospodarze = gospodarze;
        this.goscie = goscie;
        this.goleGospodarzy = goleGospodarzy;
        this.goleGosci = goleGosci;
        Stadion = stadion;
        this.strzelcyGospodarzy = strzelcyGospodarzy;
        this.strzelcyGosci = strzelcyGosci;
        this.mvp = mvp;
        dodajGole();
    }

    /**
     * wyswietla wynik meczu
     */
    public void wyswietlWynik(){
        System.out.println(gospodarze.getNazwaKlubu()+": "+goleGospodarzy + " - "+ goleGosci+" :"+goscie.getNazwaKlubu());
    }

    /**
     * wyswietla wszystkich strzelcow w meczu
     */
    public void wyswietlStrzelcow(){
        System.out.println("Dla gospodarzy strzelali: ");

        for (int i=0;i<strzelcyGospodarzy.size();i++){
            strzelcyGospodarzy.get(i).wyswetilImieNazwisko();
        }

        System.out.println("Dla gosci strzelali: ");

        for (int i=0;i<strzelcyGosci.size();i++){
            strzelcyGosci.get(i).wyswetilImieNazwisko();
        }
    }

    /**
     * dodaje gole zawodnikom
     */
    private void dodajGole(){
        for (int i=0;i<strzelcyGospodarzy.size();i++){
            strzelcyGospodarzy.get(i).dodajGola();
        }

        for (int i=0;i<strzelcyGosci.size();i++){
            strzelcyGosci.get(i).dodajGola();
        }
    }

    /**
     *
     * @return zwraca liczbe goli gospodarzy
     */
    public Integer getGoleGospodarzy() {
        return goleGospodarzy;
    }

    /**
     *
     * @return zwraca liczbe goli gosci
     */
    public Integer getGoleGosci() {
        return goleGosci;
    }

    /**
     *
     * @return zwraca druzyne gospodarzy
     */
    public Klub getGospodarze() {
        return gospodarze;
    }

    /**
     *
     * @return zwraca druzyne gosci
     */

    public Klub getGoscie() {
        return goscie;
    }

    /**
     *
     * @return zwraca wszystkie informacje o meczy
     */
    @Override
    public String toString() {
        return "Mecz{" +
                "gospodarze=" + gospodarze +
                ", goscie=" + goscie +
                ", goleGospodarzy=" + goleGospodarzy +
                ", goleGosci=" + goleGosci +
                ", Stadion='" + Stadion + '\'' +
                ", strzelcyGospodarzy=" + strzelcyGospodarzy +
                ", strzelcyGosci=" + strzelcyGosci +
                ", mvp=" + mvp +
                '}';
    }
}
