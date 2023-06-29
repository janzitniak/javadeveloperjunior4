package oop.kniznica;

import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaMain {
    public static void main(String[] args) {

        // Vytvorime prvu ukazkovu knihu, teda objekt kniha1
        Kniha kniha1 = new Kniha("Já, robot", "Isaac Asimov", 19);
        Kniha kniha2 = new Kniha("1984", "George Orwell", 15);
        Kniha kniha3 = new Kniha("To Kill a Mockingbird", "Harper Lee", 12);
        Kniha kniha4 = new Kniha("Mali princ", "Antoine de Saint-Exupéry", 10);
        Kniha kniha5 = new Kniha("Vládca prsteňov", "J.R.R. Tolkien", 25);

        // Vytvorenie dynamickeho pola, teda ArrayList-u v ktorom ulozime knihy
        ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        zoznamKnih.add(kniha1); // Do zoznamKnih, cize ArrayList-u sme doplnili prvu knihu
        zoznamKnih.add(kniha2); // Do zoznamKnih, cize ArrayList-u sme doplnili prvu knihu
        zoznamKnih.add(kniha3); // Do zoznamKnih, cize ArrayList-u sme doplnili prvu knihu
        zoznamKnih.add(kniha4); // Do zoznamKnih, cize ArrayList-u sme doplnili prvu knihu
        zoznamKnih.add(kniha5); // Do zoznamKnih, cize ArrayList-u sme doplnili prvu knihu

        // Pouzivatelsky vstup na zadanie udajov knihy
        Scanner scn = new Scanner(System.in); // Inicializacia konzoly
        System.out.println("Zadaj názov knihy:");
        String nazovKnihy = scn.nextLine(); // Zadanie konkretneho textoveho udaju z konzoly (zadava pouzivatel)

        System.out.println("Zadaj autora danej knihy:");
        String autor = scn.nextLine();

        System.out.println("Zadaj rok vydania");
        int rokVydania = scn.nextInt(); // Caka na pouzivatelsky vstup, ktory bude cele cislo

        // Vytvorili sme knihu na zaklade pouzivatelskych dat
        Kniha zadanaKniha = new Kniha(nazovKnihy, autor, rokVydania);

        // A nasledne knihu pridame do ArrayList-u
        zoznamKnih.add(zadanaKniha);

        // Vypisanie zoznamu knih z ArrayList
        for(Kniha konkretnaKniha:zoznamKnih) {
            System.out.println(konkretnaKniha);
        }

    }
}
