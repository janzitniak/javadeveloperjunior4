package oop.kniznica;

import java.util.ArrayList;
import java.util.Scanner;

public class KnihaService {

    public void zobrazMenu() {
        System.out.println("""
                Vyber prosím jednu z možností:
                -----------------------------
                (1) Zadaj novú knihu
                (2) Zobraz všetky knihy
                (3) Zobraz konkrétnu knihu (podľa indexu)
                (4) Vymaž konkrétnu knihu (podľa indexu)
                (5) Zobraz počet všetkých kníh
                (9) Vymaž všetky knihy
                Koniec = skončí zadávanie novej knihy         
                """);
    }

    public void pridajKnihu(ArrayList<Kniha> zoznamKnih) {
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
    }

    public void vypisVsetkyKnihy(ArrayList<Kniha> zoznamKnihBlaBla) {
        for(Kniha konkretnaKniha:zoznamKnihBlaBla) {
            System.out.println(konkretnaKniha);
        }
    }

    public void volbaPouzivatela(ArrayList<Kniha> zoznamKnih) {
        // Rozhodovanie, co sme si vybrali
        Scanner scn = new Scanner(System.in);
        String vybrataMenuPolozka = scn.nextLine(); // Ocakavame textovu hodnotu (zoberie aj cislo, ale ako text)
        // Logicky blok
        // Chceme len vypisovat co vybral
        switch (vybrataMenuPolozka) {
            case "1" -> {
                System.out.println("Vybral si číslo 1");
                pridajKnihu(zoznamKnih);
            }
            case "2" -> {
                System.out.println("Vybral si číslo 2");
                vypisVsetkyKnihy(zoznamKnih);
            }
            case "3" -> System.out.println("Vybral si číslo 3");
            case "koniec" -> System.out.println("Vybral si koniec");
            default -> System.out.println("Nevybral si nič z menu");
        }
    }

    public ArrayList<Kniha> naplnKniznicuKnihami() {

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

        return zoznamKnih;
    }
 }
