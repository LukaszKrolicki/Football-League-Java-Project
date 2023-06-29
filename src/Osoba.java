import java.io.Serializable;
/**
 * Klasa reprezentująca Osobe
 */
public class Osoba implements  Serializable{
    private static final long serialVersionUID = -7887612267521882048L;
    protected String imie;

    protected String nazwisko;

    protected Integer wiek;

    /**
     * Konstruktor
     * @param imie - imie osoby
     * @param nazwisko - nazwisko osoby
     * @param wiek - wiek osoby
     */
    public Osoba(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    /**
     * Funkcja zwracająca informacje o osobie
     * @return info o osobie
     */
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
