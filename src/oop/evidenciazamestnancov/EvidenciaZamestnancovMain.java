package oop.evidenciazamestnancov;

import java.time.LocalDate;

public class EvidenciaZamestnancovMain {
    public static void main(String[] args) {
        // Prvy zamestnavatel
        Zamestnavatel ibm = new Zamestnavatel();
        ibm.setNazov("IBM");
        System.out.println("\nInformácie o zamestnávateľovi" + ibm);
        ibm.naplnZamestnancami();
        ibm.vypisZamestnancov();
        System.out.println("Počet zamestnancov vo firme je: " + ibm.pocetZamestnancov());



        // Druhy zamestnavatel
        Zamestnavatel microsoft = new Zamestnavatel();
        microsoft.setNazov("Microsoft");
        //microsoft.naplnZamestnancami();
        Oddelenie pravneOddelenie = new Oddelenie("Právne oddelenie", 1);
        Zamestnanec zamestnanec1 = new Zamestnanec("Eva", "Nádherná", LocalDate.of(1980, 6, 30), false,  pravneOddelenie);
        microsoft.pridajZamestnanca(zamestnanec1); // Pridam zamestnanca ku konkretnemu zamestnavatelovi

        System.out.println("\nInformácie o zamestnávateľovi" + microsoft);
        microsoft.vypisZamestnancov();
        System.out.println("Počet zamestnancov vo firme je: " + microsoft.pocetZamestnancov());
    }
}
