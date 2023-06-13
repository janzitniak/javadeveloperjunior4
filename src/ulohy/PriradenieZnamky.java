package ulohy;
/*
Úloha 1: Program na priradenie známky
        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        HINT: Pouzitie prikazu if
*/
// TODO Vytvorit "nekonecny" pouzivatelsky vstup na zadavanie a vyhodnotenie znamok. Ukonci, pokym nezadame zaporne cislo. Pouzite prikazu while = cyklus s podmienkou na zaciatku.

import java.util.Scanner;

public class PriradenieZnamky {
    public static void main(String[] args) {
        int percenta = 0;
        int sum = 0;
        int pocet = 0;

        Scanner sc = new Scanner(System.in);

        while (percenta >= 0) {
            //while (true) {
            //for (;;) { // Nekonecny cyklus
            System.out.println("Zadaj percentá (HINT: Pri zadaní záporného čísla program sa ukončí): ");
            percenta = sc.nextInt(); // TODO Pri pouzivatelskom vstupe rovno zobrazit aj %

            if (percenta >= 0) {
                //sum = sum + percenta; // Pripocitavame percenta k povodnemu sumaru, cize sum
                sum += percenta; // Pripocitavame percenta k povodnemu sumaru, cize sum
                // pocet = pocet + 1; // Obsah premennej pocet zvysime o 1
                pocet++; // Obsah premennej pocet zvysime o 1
            }
            // &&   pouzijeme pri podmienkach, ktore musia platit zaroven (AND)
            // ||   pouzijeme pri podmienkach, pri ktorych staci, ked plati jedna z nich (OR). Pipe vo Windows-e vlozime kombinaciou AltGr + W
            if (percenta > 90)
                System.out.println("A");
            else if (percenta >= 75 && percenta < 90)
                System.out.println("B");
            else if (percenta >= 65 && percenta < 75)
                System.out.println("C");
            else if (percenta >= 0 && percenta < 65)
                System.out.println("Neuspel");
                //break; // Stopneme "nekonecny" cyklus, cize while(true)*/
            else
                System.out.println("Neočakávaná vstupná hodnota");
        }

        System.out.println("Priemer známok je: " + (sum / pocet));
        System.out.println("Koniec programu");

    }
}
// TODO Prestavka do 14.15