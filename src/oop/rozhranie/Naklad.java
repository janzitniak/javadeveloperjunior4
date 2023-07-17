package oop.rozhranie;

public class Naklad implements INaklad, ISuperNaklad {
    @Override
    public void vypis() {
        // Konkretna implemtancia danej metody
        System.out.println("Vypisujem konkrétne údaje o náklade");
    }

    @Override
    public void vytlac() {

    }

    @Override
    public void zoznamNakladov() {

    }

    @Override
    public double celkoveNaklady() {
        return 0;
    }

    @Override
    public void exportDoPDF() {

    }

    @Override
    public void preplatiNamHoNiekto() {

    }

    // Moja metoda
    private void vypisNakladDoKonzoly() {

    }

}
