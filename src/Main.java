import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Klub> listaKlubow = new ArrayList<>();

        //ManUtd
        Zawodnik Rushford = new Zawodnik("Marcus", "Rashford", 22, "Napastnik", 150, 100000, 0, 0);
        Zawodnik DeGea = new Zawodnik("David", "DeGea", 40, "Bramkarz", 220, 12200000, 0, 1);
        Zawodnik Shaw = new Zawodnik("Luke", "Shaw", 12, "Lewy obrońca", 160, 12000, 0, 2);
        Zawodnik Harry = new Zawodnik("Harry", "Maguire", 50, "Srodkowy obronca", 150, 10000000, 0, 3);
        Zawodnik Burno = new Zawodnik("Bruno", "Fernandesh", 10, "Pomocnik", 130, 1000, 0, 4);
        ArrayList<Zawodnik> listaManUtd = new ArrayList<>();
        listaManUtd.add(Rushford); listaManUtd.add(DeGea); listaManUtd.add(Shaw); listaManUtd.add(Harry); listaManUtd.add(Burno);
        Trener Erik = new Trener("Erik", "TenHag", 67, 12222);

        //Chelsea
        Zawodnik Mudryk = new Zawodnik("Michaylo", "Mudryk", 10, "Pomocnik", 190, 1000009, 0, 0);
        Zawodnik Enzo = new Zawodnik("Enzo", "Fernandez", 34, "Pomocnik", 150, 1220000, 0, 1);
        Zawodnik Jao = new Zawodnik("Jao", "Felix", 19, "Napastnik", 170, 120080, 0, 2);
        Zawodnik Kepa = new Zawodnik("Kepa", "Arrizabalaga", 30, "Bramkarz", 185, 10000020, 0, 3);
        Zawodnik Mason = new Zawodnik("Mason", "Mount", 17, "Pomocnik", 140, 10003, 0, 4);
        ArrayList<Zawodnik> listaChelsea = new ArrayList<>();
        listaChelsea.add(Mudryk); listaChelsea.add(Enzo); listaChelsea.add(Jao); listaChelsea.add(Kepa); listaChelsea.add(Mason);
        Trener Lampard = new Trener("Frank", "Lampard", 66, 12232);

        //Liverpool
        Zawodnik Mohamed = new Zawodnik("Mohamed", "Saslah", 24, "Napastnik", 160, 1000209, 0, 0);
        Zawodnik Firmino = new Zawodnik("Roberto", "Firmino", 32, "Napastnik", 170, 12450000, 0, 1);
        Zawodnik Nunez = new Zawodnik("Darwin", "Nunez", 29, "Napastnik", 187, 1200280, 0, 2);
        Zawodnik Allison = new Zawodnik("Alisson", "Becker", 33, "Bramkarz", 185, 1000020, 0, 3);
        Zawodnik Cody = new Zawodnik("Cody", "Gakpo", 12, "Napastnik", 150, 100203, 0, 4);
        ArrayList<Zawodnik> listaLiverpool = new ArrayList<>();
        listaLiverpool.add(Mohamed); listaLiverpool.add(Firmino); listaLiverpool.add(Nunez); listaLiverpool.add(Allison); listaLiverpool.add(Cody);
        Trener Klop = new Trener("Jurgen", "Klopp", 55, 122232);

        //city
        Zawodnik  Erling= new Zawodnik("Erling", "Halland", 22, "Napastnik", 190, 1000200, 0, 0);
        Zawodnik Bruyne = new Zawodnik("Kevin", "De Bruyne", 32, "Pomocnik", 170, 1245000, 0, 1);
        Zawodnik  Julian= new Zawodnik("Julian", "Alvarez", 28, "Napastnik", 183, 1300000, 0, 2);
        Zawodnik Phil = new Zawodnik("Phil", "Foden", 21, "Pomocnik", 180, 1400000, 0, 3);
        Zawodnik Ruben = new Zawodnik("Ruben", "Dias", 22, "Obronca", 170, 100203, 0, 4);
        ArrayList<Zawodnik> listaCity = new ArrayList<>();
        listaCity.add(Erling); listaCity.add(Bruyne); listaCity.add(Julian); listaCity.add(Phil); listaCity.add(Ruben);
        Trener Guardiola = new Trener("Pep", "Guardiola", 52, 122232);

        //Arsenal
        Zawodnik  Olekandr= new Zawodnik("Oleksandr", "Ziczenko", 23, "Pomocnik", 188, 1030000, 0, 0);
        Zawodnik Bukayo = new Zawodnik("Bukayo", "Saka", 22, "Pomocnik", 170, 1246000, 0, 1);
        Zawodnik  Xhaka= new Zawodnik("Granit", "Xhaka", 28, "Pomocnik", 160, 1300000, 0, 2);
        Zawodnik Gabriel = new Zawodnik("Gabriel", "Jesus", 21, "Napastnik", 172, 1400000, 0, 3);

        ArrayList<Zawodnik> listaArsenal = new ArrayList<>();
        listaArsenal.add(Olekandr); listaArsenal.add(Bukayo); listaArsenal.add(Xhaka); listaArsenal.add(Gabriel);
        Trener Arteta = new Trener("Mikel", "Guardiola", 42, 122232);

        //Kluby
        Klub ManchesterUtd = new Klub("Manchester United", 0, listaManUtd, Erik, "Old Traford",1900000000);
        Klub ChelseaFC = new Klub("Chelsea FC", 0, listaChelsea, Lampard, "Stamford Bridge",1800000000 );
        Klub Liverpool = new Klub("Liverpool", 0, listaLiverpool, Klop, "Anfield",1700000000);
        Klub City = new Klub("Manchester City", 0, listaCity, Guardiola, "Manchester City Stadium",1500000000);
        Klub Arsenal = new Klub("Arsenal",0,listaArsenal,Arteta,"Emirates Stadium",1200000000);

        //Zatrudnianie zawonika
        Zawodnik Aaron = new Zawodnik("Aaron", "Ramsdale", 25, "Bramkarz", 183, 100203, 0);
        Arsenal.zatrudnijZawodnika(Aaron,4);

        //tworzenie Premier League
        listaKlubow.add(ManchesterUtd); listaKlubow.add(ChelseaFC);listaKlubow.add(Liverpool);listaKlubow.add(City);listaKlubow.add(Arsenal);
        PremierLeague ligapremierow = new PremierLeague("Pilka nozna", 12, "PremierLeague Trophy", 2, 1,listaKlubow);

        System.out.println();
        //Informacje o klubie
        System.out.println(ManchesterUtd.toString());

        System.out.println();
        //Zatrudnieni zawodnicy
        ManchesterUtd.wyswietlZawodnikow();

        System.out.println();
        //Mecze
        ArrayList<Zawodnik> strzMan = new ArrayList<>();
        strzMan.add(Rushford); strzMan.add(Rushford); strzMan.add(DeGea);
        ArrayList<Zawodnik> strzArs = new ArrayList<>();
        strzArs.add(Olekandr); strzArs.add(Bukayo);
        Mecz mecz1 = new Mecz(ManchesterUtd, Arsenal, 3, 2, ManchesterUtd.getStadion(), strzMan, strzArs, DeGea);
        ligapremierow.dodajPunkty(mecz1);
        //Informacje o meczu
        mecz1.wyswietlStrzelcow();
        mecz1.wyswietlWynik();

        ArrayList<Zawodnik> strzCity = new ArrayList<>();
        strzCity.add(Erling); strzCity.add(Erling); strzCity.add(Erling);
        ArrayList<Zawodnik> strzLive = new ArrayList<>();
        strzLive.add(Mohamed);
        Mecz mecz2 = new Mecz(City, Liverpool, 3, 1, City.getStadion(), strzCity, strzLive, Erling);
        ligapremierow.dodajPunkty(mecz2);

        ArrayList<Zawodnik> strzChe = new ArrayList<>();
        strzChe.add(Xhaka);
        ArrayList<Zawodnik> strzArse = new ArrayList<>();
        strzArse.add(Gabriel);
        Mecz mecz3 = new Mecz(ChelseaFC, Arsenal, 1, 1, ChelseaFC.getStadion(), strzChe, strzArse, Gabriel);
        ligapremierow.dodajPunkty(mecz3);

        //Tabela
        ligapremierow.wyswietlTabele();

        //Drużyny spadkowe/premiowane
        ligapremierow.wyswietlDruzynyPremiowane();
        ligapremierow.wyswietlDruzynySpadkowe();

        System.out.println();
        System.out.println(Rushford.toString());

        //Klasa wewnętrzna
        String szybkosc = "Jest szybki bardzo";
        String perspektywa = "Chlopak ma swietlana przyszlosc, raczej...";
        ArrayList<String> atr = new ArrayList<>();
        atr.add(szybkosc); atr.add(perspektywa);
        ArrayList<String> os = new ArrayList<>();
        os.add("Mistrz podworka"); os.add("Stypendium burmistrza");
        Zawodnik.OpisZawodnika opisRashford = Rushford.new OpisZawodnika(atr, os);
        opisRashford.wyswietlOpis();
        System.out.println();


        //Polimorfiznm
        Osoba osoba = new Trener("Adam", "Michniewicz", 45, 12000);  // rzutowanie w górę
        System.out.println(osoba.toString()); //polimorficzne wywołanie metody

        //Zapis i odczyt do i z pliku
        // tworzymy obiekt klasy ObjectOutputStream do zapisywania do pliku
        try {
            ObjectOutputStream wyjscie = new ObjectOutputStream(new FileOutputStream(".\\trener.dat"));
            // tworzymy obiekt klasy Trener, który chcemy zapisać
            Trener DariuszG = new Trener("Dariusz", "Gaździk", 45, 500);

            // no i zapisujemy
            wyjscie.writeObject(DariuszG);
            wyjscie.writeObject(new Trener("Xavi", "Hernandez", 40, 50000));
            wyjscie.close();
            //odczyt
            // tworzymy obiekt klasy ObjectInputStream do odczytywania z pliku
            ObjectInputStream wejscie = new ObjectInputStream(new FileInputStream(".\\trener.dat"));

            // odczytujemy z pliku; (Trener) - to rzutowanie z Object na Trener
            Trener p1 = (Trener) wejscie.readObject();

            // konsolę wyrzucamy wynik
            System.out.println(p1);
            Trener p2 = (Trener) wejscie.readObject();
            System.out.println(p2);
            wejscie.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}