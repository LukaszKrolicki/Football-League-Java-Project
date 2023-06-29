import java.io.Serializable;
/**
 * Klasa reprezentujaca Trenera - dziedziczy po osobie
 */
public class Trener extends Osoba implements Serializable{

    private Integer zarobkiTygodniwe;
    private static final long serialVersionUID = -7887612267521882048L;

    /**
     *
     * @param imie - imie trenera
     * @param nazwisko - nazwisko trenera
     * @param wiek - wiek trenera
     * @param zarobkiTygodniwe - zarobki trenera
     */
    public Trener(String imie, String nazwisko, Integer wiek, Integer zarobkiTygodniwe) {
        super(imie, nazwisko, wiek);
        this.zarobkiTygodniwe = zarobkiTygodniwe;
    }

    /**
     * funkcja zwraca informacje o trenerze
     * @return info o trenerze
     */
    @Override
    public String toString() {
        return "Trener{" +
                "zarobkiTygodniwe=" + zarobkiTygodniwe +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
