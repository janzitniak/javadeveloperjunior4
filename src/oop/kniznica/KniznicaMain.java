package oop.kniznica;

public class KniznicaMain {
    public static void main(String[] args) {

        // Ak chceme vyuzivat nestaticke metody, teda tie, v ktorych nie je napisane slovo static, tak musime najprv vytvorit objekt
        KnihaService knihaServiceObjekt = new KnihaService();


        // Start menu, resp. aplikacie
        knihaServiceObjekt.startMenu();

        // Otestovanie funkcionality pridavania knihy
        //knihaServiceObjekt.pridajKnihu(zoznamKnih);

        // Vypisanie zoznamu knih z ArrayList
        //knihaServiceObjekt.vypisVsetkyKnihy(zoznamKnih);

    }
}
