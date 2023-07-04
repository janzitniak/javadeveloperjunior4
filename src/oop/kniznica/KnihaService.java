package oop.kniznica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnihaService {
    ArrayList<Kniha> zoznamKnih; // My sme vytvorili objekt, resp. ArrayList ako prazdny

    // Bezparametricky konstruktor
    public KnihaService() {
        //zoznamKnih = naplnKniznicuKnihami();
        zoznamKnih = new ArrayList<>(); // Vytvorenie prazdneho zoznamu knih
    }

    public void zobrazMenu() {
        System.out.println("""
                                
                Vyber prosím jednu z možností:
                -----------------------------
                (1) Zadaj novú knihu
                (2) Zobraz všetky knihy
                (3) Zobraz konkrétnu knihu (podľa indexu)
                (4) Vymaž konkrétnu knihu (podľa indexu)
                (5) Zobraz počet všetkých kníh
                (6) Vyhľadaj knihu/knihy podľa názvu (fulltext hľadanie)
                (7) Načítaj zoznam kníh zo súboru (zadaj názov súboru)
                (8) Ulož zoznam kníh do súboru (zadaj názov súboru)
                (9) Vymaž všetky knihy
                Koniec = skončí zadávanie novej knihy         
                """);
    }

    public void hladajKnihyPodlaNazvu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov knihy:");
        String hladanyNazov = scn.nextLine();

        ArrayList<Kniha> najdeneKnihy = new ArrayList<>(); // Prazdny zoznam najdenych knih
        for(Kniha konkretnaKniha: zoznamKnih) { // foreach pre prechadzanie kazdej knihy v nasom zozname knih
            // Obsahuje nazov konkretnej knihy aspon cast nazvu knihy, ktory hladame?
            if (konkretnaKniha.getNazov().contains(hladanyNazov)) {
                najdeneKnihy.add(konkretnaKniha); // Ak taku knihu najde, tak ju ulozi do zoznamu najdeneKnihy
            }
        }
        // Vypiseme najdene knihy
        System.out.println("\nNájdené knihy sú tieto:");
        for(Kniha najdenaKniha:najdeneKnihy) {
            System.out.println(najdenaKniha);
        }
    }

    // Metoda ulozDoSuboru vyzve pouzivatela na zadanie nazvu suboru a nasledne ho ulozi
    public void ulozDoSuboru() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov súboru:");
        String nazovSuboru = scn.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nazovSuboru); // vytvorime subor s nazvom kniha.ser
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorime Object stream pre ukladanie objektov
            objectOutputStream.writeObject(zoznamKnih); // zapiseme objekt
            objectOutputStream.flush(); // realne uskutocnime operaciu zapisu
            objectOutputStream.close(); // zatvorime object output stream
            fileOutputStream.close(); // zatvorime file output stream, cize subor*/
            System.out.println("Súbor je uložený!");
        } catch (IOException e) {
            System.out.println("Nepodaril sa vytvoriť súbor, resp. ho uložiť!");
            e.printStackTrace();
        }
    }

    // Metoda nacitajZoSuboru vyzve pouzivatela na zadanie nazvu suboru a nasledne ho otvori
    public void nacitajZoSuboru() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov súboru:");
        String nazovSuboru = scn.nextLine();
        try {
            FileInputStream fileInputStream = new FileInputStream(nazovSuboru);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            zoznamKnih = (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Súbor je načítaný!");
        } catch (IOException e) {
            System.out.println("Nepodaril sa otvoriť súbor!");
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Súbor sa podaril načítať, ale nie je kompatibilný z ArrayList!");
            //e.printStackTrace();
        }
    }

    public void pridajKnihu() {
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

    public void vypisVsetkyKnihy() {
/*        for(Kniha konkretnaKniha:zoznamKnihBlaBla) {
            System.out.println(konkretnaKniha);
        }*/
        if (!zoznamKnih.isEmpty()) {
            for (int i = 0; i < zoznamKnih.size(); i++) {
                System.out.print("Index knihy: " + i); // Index knihy
                System.out.print("\t"); // Pouzijem este tabulator
                System.out.println(zoznamKnih.get(i)); // Detail knihy, ktory riesi metoda toString v Kniha.java
            }
        }
        else {
            System.out.println("Zoznam kníh je prázdny!");
        }
    }

    public void odstranKnihu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktorú chceš odstrániť?");
        int indexKnihy = scn.nextInt();
        if (potvrdVolbu()) {
            zoznamKnih.remove(indexKnihy); // Odstrani knihu pouzitim metodu remove a index-u
            System.out.println("Kniha je odstránená");
        }
    }

    public Kniha najdiKnihu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktorú chceš zobraziť");
        int indexKnihy = scn.nextInt();
        return zoznamKnih.get(indexKnihy);
    }

    public int pocetKnih() {
        return zoznamKnih.size(); // Vrati pocet vsetkych knih, resp. poloziek z ArrayList-u
    }

    private boolean potvrdVolbu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Naozaj si praješ koniec? Potvrď (a) ako áno, iný vstup pokračuje ďalej.");
        String odpoved = scn.nextLine();
        if (odpoved.equalsIgnoreCase("a")) return true;
        else return false;
    }


    public void startMenu() {
        String vybrataMenuPolozka = "";
        // Opakujeme volbu pouzivatela
        while (!vybrataMenuPolozka.equals("koniec")) { // Nekonecny cyklus
            // Zobrazujeme menu
            zobrazMenu();
            // Rozhodovanie, co sme si vybrali
            Scanner scn = new Scanner(System.in);
            vybrataMenuPolozka = scn.nextLine().toLowerCase(); // Ocakavame textovu hodnotu (zoberie aj cislo, ale ako text) a zaroven prekonvertuje na male pismena
            // Logicky blok
            // Chceme len vypisovat co vybral
            switch (vybrataMenuPolozka) { // "Prekonvertovali" sme String, cize text na male pismena
                case "1" -> {
                    System.out.println("Vybral si číslo 1");
                    pridajKnihu();
                }
                case "2" -> {
                    System.out.println("Vybral si číslo 2");
                    vypisVsetkyKnihy();
                }
                case "3" -> {
                    System.out.println("Vybral si číslo 3");
                    Kniha najdenaKniha = najdiKnihu();
                    System.out.println("Detaily o nájdenej knihe: " + najdenaKniha);
                }
                case "4" -> {
                    System.out.println("Vybral si číslo 4");
                    odstranKnihu();
                    // Tu bude pouzivatelsky vstup na zadanie indexu knihy, ktoru ideme zmazat
                    // Ked zadame index knihy, tak pred samotnym mazanim sa vykona metoda potvrdVolbu(scn), vid nizsie
                }
                case "5" -> {
                    System.out.println("Vybral si číslo 5");
                    System.out.println("Počet všetkých kníh v zozname: " + pocetKnih());
                }
                case "6" -> {
                    hladajKnihyPodlaNazvu();
                }
                case "7" -> {
                    nacitajZoSuboru();
                }
                case "8" -> {
                    ulozDoSuboru();
                }
                case "koniec" -> {
                    System.out.println("Vybral si koniec");
                    if (potvrdVolbu()) System.exit(1);
                    else vybrataMenuPolozka = "";
/*                    if (odpoved.equalsIgnoreCase("a")) System.exit(0); // System.exit ukonci aplikaciu, resp. JVM
                    else vybrataMenuPolozka = "";*/
/*                    if (odpoved.equalsIgnoreCase("a")) return; // Ukoncenie programu, resp. metody main bez navratovej hodnoty
                    else vybrataMenuPolozka = "";*/
                }
                default -> {
                    System.out.println("Nevybral si nič z menu");
                    System.out.println("Zvolil si: " + vybrataMenuPolozka);
                }
            }
        }
    }

    public ArrayList<Kniha> naplnKniznicuKnihami() {

        // Vytvorime prvu ukazkovu knihu, teda objekt kniha1
        Kniha kniha1 = new Kniha("Já, robot", "Isaac Asimov", 1919);
        Kniha kniha2 = new Kniha("1984", "George Orwell", 1915);
        Kniha kniha3 = new Kniha("To Kill a Mockingbird", "Harper Lee", 1982);
        Kniha kniha4 = new Kniha("Mali princ", "Antoine de Saint-Exupéry", 2000);
        Kniha kniha5 = new Kniha("Vládca prsteňov", "J.R.R. Tolkien", 1925);

        // Vytvorenie dynamickeho pola, teda ArrayList-u v ktorom ulozime knihy
        ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        zoznamKnih.add(kniha1); // Do zoznamKnih, cize ArrayList-u sme doplnili knihu
        zoznamKnih.add(kniha2); // Do zoznamKnih, cize ArrayList-u sme doplnili knihu
        zoznamKnih.add(kniha3); // Do zoznamKnih, cize ArrayList-u sme doplnili knihu
        zoznamKnih.add(kniha4); // Do zoznamKnih, cize ArrayList-u sme doplnili knihu
        zoznamKnih.add(kniha5); // Do zoznamKnih, cize ArrayList-u sme doplnili knihu

        return zoznamKnih;
    }
 }
