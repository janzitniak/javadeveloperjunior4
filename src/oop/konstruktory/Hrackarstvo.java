package oop.konstruktory;

public class Hrackarstvo {
    public static void main(String[] args) {
        // Vytvorime prvu hracku
        Hracka moncici = new Hracka(); // Vytvorili sme novy objekt = instanciu triedy hracky s nazvom moncici
        // Volanie setterov na naplnenie atributov objektu
        moncici.setNazov("Mončiči");
        moncici.setCena(15.0);
        moncici.setFarba("ružové");
        moncici.setMaterial("plyš");
        moncici.setVekoveUrcenie("0-99");

        System.out.println("Atribúty hračky");
        System.out.println("Názov: " + moncici.getNazov());
        System.out.println("Cena: " + moncici.getCena());
        System.out.println("Farba: " + moncici.getFarba());
        System.out.println("Materiál: " + moncici.getMaterial());
        System.out.println("Vekové určenie: " + moncici.getVekoveUrcenie());

        System.out.println(); // Prazdny riadok

        // Vytvorime druhu hracku
        Hracka lego = new Hracka("plast", "rôzna", 15.50, "0-99", "Lego"); // Vytvorili sme objekt cez parametricky konstruktor
        // Vypiseme atributy druhej hracky
        System.out.println("Atribúty hračky");
        System.out.println("Názov: " + lego.getNazov());
        System.out.println("Cena: " + lego.getCena());
        System.out.println("Farba: " + lego.getFarba());
        System.out.println("Materiál: " + lego.getMaterial());
        System.out.println("Vekové určenie: " + lego.getVekoveUrcenie());

        // Vytvorime tretiu hracku
        Hracka merkur = new Hracka("kov", "rôzna", "0-99", "Merkúr");
        System.out.println(merkur);

        // Vytvorime stvrtu hracku
        Hracka bicykel = new Hracka();
        System.out.println(bicykel);

    }
}
