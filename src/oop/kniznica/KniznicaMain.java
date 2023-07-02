package oop.kniznica;

import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaMain {
    public static void main(String[] args) {

        // Ak chceme vyuzivat nestaticke metody, teda tie, v ktorych nie je napisane slovo static, tak musime najprv vytvorit objekt
        KnihaService knihaServiceObjekt = new KnihaService();
        ArrayList<Kniha> zoznamKnih = knihaServiceObjekt.naplnKniznicuKnihami();

        // Zobrazujeme menu
        knihaServiceObjekt.zobrazMenu();

        // Volba pouzivatela podla menu
        knihaServiceObjekt.volbaPouzivatela(zoznamKnih);

        // Otestovanie funkcionality pridavania knihy
        //knihaServiceObjekt.pridajKnihu(zoznamKnih);

        // Vypisanie zoznamu knih z ArrayList
        //knihaServiceObjekt.vypisVsetkyKnihy(zoznamKnih);

    }
}
