package ulohy;
/*
Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšeme.
        Používanie aplikácie: Používateľ spustí program s názvom ZadavanieKnih (InputBooks), ktorý používateľa vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadávanie ukončí a následne vypíše zoznamu všetkých zadaných kníh.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ZadavanieKnih {
    public static void main(String[] args) {
        //int i; // premenna i je dostupna v ramci bloku

        Scanner skener = new Scanner(System.in);
        ArrayList<String> zoznamKnih = new ArrayList<String>(); // inicializuje dynamicke pole, ktore je prazdne

        System.out.println("Zadaj názvy kníh. Potvrď názov klávesom ENTER. Príkaz 'koniec' ukončí zadávanie.");

        // cyklus zacina tu
        while (true) { // nekonecny cyklus, funguje kym true
            //i = 0;
            String kniha = skener.nextLine(); // nextLine je pre String, cize text
            // System.out.println("Zadaná kniha je: " + kniha);
            if (kniha.toLowerCase().equals("koniec")) break; // ukonci cyklus, ked premenna kniha bude obsahovat slovo koniec
            zoznamKnih.add(kniha); // pridali sme knihu
        }

        Collections.sort(zoznamKnih); // zoznam knih je zoradeny abecedne

        // premenna zoznamKnih tu uz nie je dostupna
        // System.out.println(i); // premenna i tu uz nie je dostupna
        // cyklus konci tu
        // vypis vsetkych knih
        for(String vystup:zoznamKnih) {
            System.out.println(vystup); // vystup je samotna kniha, teda jej nazov
        }

        for (int i = 0; i < zoznamKnih.size(); i++) {
            System.out.println(zoznamKnih.get(i)); // vypiseme kazdu knihu cez jej index, cize get(i)
        }

    }
}