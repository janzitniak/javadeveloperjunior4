package oop;

public class Kniha {
    // Atributy triedy, premenne triedy, fields
    public String nazov;
    public String autor;
    public int rokVydania;
    public int pocetStran;
    public double cena;

    public void pozdrav() {
        System.out.println("Ahoj, ja som vytvorený objekt kniha, čiže naozajstná kniha!" + nazov);
        System.out.println("A autorom tejto knihy: " + autor);
        System.out.println("A rok vydania je: " + rokVydania);
        //return "Ahoj, ja som vytvorený objekt kniha, čiže naozajstná kniha!";
    }
}
