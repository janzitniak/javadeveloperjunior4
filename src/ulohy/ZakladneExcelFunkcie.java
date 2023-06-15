package ulohy;

import java.util.Arrays;

/*
Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.

        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
        Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.
*/

public class ZakladneExcelFunkcie {

    public static double max(double [] cisla) {
        Arrays.sort(cisla); // Zoradi cisla od najmensieho po najvacsie
        return cisla[cisla.length-1];
    }

    public static double min(double [] cisla) {
        Arrays.sort(cisla); // Zoradi cisla od najmensieho po najvacsie
        return cisla[0]; // Odkazujeme sa na prvy prvok pola, cize ten je reprezentovany 0-lou
    }


    public static double sucet(double [] cisla) {
        double sum = 0; // Vytvaram premennu sum, ktora reprezentuje sucet a na zaciatku obsahuje 0
        for(double cislo: cisla) {
            sum = sum + cislo; // Interpretujeme vpravo od rovna sa, cize najprv dojde k scitaniu premennych a vysledok sa ulozi do premennej nalavo od rovna sa
            // sum += cislo; // Tento zapis robi presne to iste, co vyssie, cize sum = sum + cislo;
        }
        return sum;
    }

    public static int pocet(double [] cisla) {
        return cisla.length;
    }

    public static double priemer(double [] cisla) {
        return sucet(cisla)/pocet(cisla);
    }

    public static void vypisPoleCezForEach(double [] poleCisel) {
        for(double desatinneCislo: poleCisel) {
            System.out.println(desatinneCislo);
        }
    }

    public static void vypisPole(double [] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);
        }
    }

    public static void main(String[] args) {
        double [] cisla = {100, 2.5, 4, 8.5, 10}; // Vytvorili sme pole s desatinnymi cislami
        //vypisPole(cisla);
        //vypisPoleCezForEach(cisla);
        System.out.println("Výsledok sčítania poľa čísel (SUM) je: " + sucet(cisla));
        System.out.println("Výsledok priemerovania (AVERAGE): " + priemer(cisla));
        System.out.println("Výsledok počtu (COUNT): " + pocet(cisla));
        System.out.println("Výsledok maxima (MAX): " + max(cisla));
        System.out.println("Výsledok minima (MIN): " + min(cisla));
    }
}
