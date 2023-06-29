import java.util.ArrayList;
import java.util.List;

/**
 * Klasa abstrakcyjna Liga - reprezentuje lige sportowa
 */
public abstract class Liga { //klasa abstrakcyjna
    /**
     * zmienna reprezentuje nazwe rozgrywek (np Pilka nozna, Koszykowka)
     */
    private String nazwaRozgrywek;
    /**
     * zmienna reprezentuje ilosc druzyn
     */
    protected Integer iloscDruzyn;
    /**
     * zmienna reprezentuje nazwe trofeum uzyskiwana za najlepsze miejsce w lidze
     */
    private String nazwaTrofeum;
    /**
     * zmienna reprezentuje liczbe druzyn premiowanych do ligi wyzszej
     */
    protected Integer liczbaDruzynPremiowanych;
    /**
     * zmienna reprezentuje liczbe druzyn spadajacyhc od nizszej ligi
     */
    protected Integer liczbaDruzynSpadkowych;

    /**
     *
     * @param nazwaRozgrywek - np (Pilka nozna, koszykowka)
     * @param iloscDruzyn - opisuje ilosc druzyn w lidze
     * @param nazwaTrofeum - trofeum za zwyciestwo w danej lidze
     * @param liczbaDruzynPremiowanych - ilosc druzyn, ktore wchodza do wyzszej ligi
     * @param liczbaDruzynSpadkowych - ilosc druzyn, ktore spadaja do nizszej ligi
     */
    public Liga(String nazwaRozgrywek, Integer iloscDruzyn, String nazwaTrofeum, Integer liczbaDruzynPremiowanych, Integer liczbaDruzynSpadkowych) {
        this.nazwaRozgrywek = nazwaRozgrywek;
        this.iloscDruzyn = iloscDruzyn;
        this.nazwaTrofeum = nazwaTrofeum;
        this.liczbaDruzynPremiowanych = liczbaDruzynPremiowanych;
        this.liczbaDruzynSpadkowych = liczbaDruzynSpadkowych;
    }
}
