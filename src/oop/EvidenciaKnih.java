package oop;

import java.util.ArrayList;

public class EvidenciaKnih {
    public static void main(String[] args) {
/*        String nazov = "Hobit";
        String nazov2 = new String("Duna");

        System.out.println("Názov 1. knihy typu String bez new: " + nazov );
        System.out.println("Názov 2. knihy typu String s new: " + nazov2);*/

        // TODO Ako vytvorit knihu a naplnit ju udajmi, cize vytvorime objekt Kniha
        Kniha kniha1 = new Kniha(); // Vytvorili sme objekt kniha, resp. instanciu triedy Kniha, ktory neobsahuje ziadne konkretne udaje
        // A nasledne knihu vyplnime konkretnymi udajmi
        kniha1.autor = "Isaac Asimov";
        kniha1.nazov = "Já, robot";
        kniha1.cena = 3.80;
        kniha1.pocetStran = 150;
        kniha1.rokVydania = 1960;
        //System.out.println(kniha1.pozdrav());
        kniha1.pozdrav();

        // Vypiseme obsah knihy
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Cena: " + kniha1.cena);
        System.out.println("Počet strán: " + kniha1.pocetStran);
        System.out.println("Rok vydania: " + kniha1.rokVydania);

        //Kniha kniha2 = null; // Prazdny objekt, pretoze je null
        //Kniha kniha3; // Prazdny objekt, pretoze je null

        System.out.println(); // Prazdny riadok

        // TODO Vytvorit dalsiu knihu
        Kniha kniha2 = new Kniha(); // Akonahle vytvorime objekt, tak nebude dana premenna prazdna, resp. nullova
        kniha2.autor = "J.R.R. Tolkien";
        kniha2.nazov = "Hobit";
        if (kniha2 != null) {
            // Vypiseme obsah knihy
            System.out.println("Autor knihy: " + kniha2.autor);
            if (kniha2.nazov == null) // Overime si, ci je nazov knihy prazdny
                System.out.println("Názov knihy je naozaj prázdny!");
            else
                System.out.println("Názov knihy: " + kniha2.nazov);
            System.out.println("Cena: " + kniha2.cena);
            System.out.println("Počet strán: " + kniha2.pocetStran);
            System.out.println("Rok vydania: " + kniha2.rokVydania);
            kniha2.pozdrav();
        }

        // Vytvarame 3-tiu knihu
        Kniha kniha3 = null; // Ak prirademe null, tak objekt Kniha v premennej kniha3 neexistuje

        // Prostrednictvom vynimky try-catch overujeme ci je objekt kniha3 vytvoreny
        try {
            kniha3.autor = "F.Herbert";
            kniha3.nazov = "Duna";
            kniha3.pozdrav();
        } catch (NullPointerException e) {
            System.out.println("Objekt kniha3 je null, nie je vytvorený");
        }

        // Overenie ci je kniha4 prazdna
/*        Kniha kniha4 = null;
        if (kniha4.isEmpty()) { // isEmpty nefunguje pre prazdny alebo naplneny objekt kniha4, lebo neexistuje
            System.out.println("Objekt kniha4 neexistuje!");
        }*/

        ArrayList dynamickePole = new ArrayList();
        if (dynamickePole.isEmpty()) { // Testujeme, ci je ArrayList prazdny, cize to znamena, ze sme nepridali ziadny "obsah". Neznamena to, ze sme ho testovali na null.
            System.out.println("Dynamické pole vytvorené ArrayList-om je prázdne!");
        }

        
    }
}
