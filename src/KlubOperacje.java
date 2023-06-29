public interface KlubOperacje { //interfejs
    /**
     * Funkcja kontraktujaca zawodnika
     * @param x - zawodnik zatrudniany
     * @param id - id nadawane w klubie
     */
    void zatrudnijZawodnika(Zawodnik x, Integer id);
    /**
     * Funkcja zwalniająca zawodnika
     * @param id - id zawodnika do zwolnienia
     */
    void zwolnijZawonika(Integer id);

    /**
     * Funkcja pozwala na zwiekszenie zarobkow zawodnika
     * @param id - id Zawodnika
     * @param ile - kwota o ile zwiekszyc zarobki
     */
    void zwiekszZarobkiZawodnika(Integer id, Integer ile);

    /**
     * Funkcja pozwala na zmniejszenie zarobkow zawodnika
     * @param id - id Zawodnika
     * @param ile - kwota o ile zmniejszyc zarobki
     */
    void zmniejszZarobkiZawodnika(Integer id, Integer ile);

    /**
     * Funkcja pozwala na wyplate srodkow zawodnikowi
     * @param id - id zawodnika
     */
    void wyplataZawodnikowi(Integer id);
}
