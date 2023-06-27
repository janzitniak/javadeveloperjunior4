package oop;

public class SkladOvocia {
    public static void main(String[] args) {
        Ovocie jablko = new Ovocie(); // Vytvorili sme objekt jablko
        jablko.farba = "zelená";
        jablko.jeSladke = true;
        jablko.mnozstvoVitaminov = 90;
        jablko.odroda = "Red delicious";
        jablko.nazov = "Jablko";
        // jablko.rocneObdobie = "zima"; // Vypise chybu, pretoze rocneObdobie je konstanta (cize pouzity modifikator final)

        Ovocie hruska = new Ovocie(); // Vytvorili sme objekt hruska
        hruska.farba = "zelená";
        hruska.jeSladke = true;
        hruska.mnozstvoVitaminov = 80;
        hruska.odroda = "domáca";
        hruska.nazov = "Hruška";

        System.out.println("Názov ovocia: " + jablko.akeOvocie());
        System.out.println("Farba ovocia: " + jablko.farba);
        System.out.println("Je sladké: " + jablko.jeSladke);
        System.out.println("Množstvo vitamínov: " + jablko.mnozstvoVitaminov);
        System.out.println("Odroda: " + jablko.odroda);
        System.out.println("Ročné obdobie zberu: " + jablko.rocneObdobie);

        System.out.println(); // Prázdny riadok

        System.out.println("Názov ovocia: " + hruska.akeOvocie());
        System.out.println("Farba ovocia: " + hruska.farba);
        System.out.println("Je sladké: " + hruska.jeSladke);
        System.out.println("Množstvo vitamínov: " + hruska.mnozstvoVitaminov);
        System.out.println("Odroda: " + hruska.odroda);
        System.out.println("Ročné obdobie zberu: " + jablko.rocneObdobie);

    }
}
