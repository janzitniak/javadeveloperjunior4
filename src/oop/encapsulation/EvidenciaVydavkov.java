package oop.encapsulation;

public class EvidenciaVydavkov {
    public static void main(String[] args) {
        Vydavok chlieb = new Vydavok();
        chlieb.setNazov("Čierny chlieb");
        chlieb.setCena(1.90);
        chlieb.setKategoria("Potraviny");

        // Vypis obsah objektu chlieb
        System.out.println("Názov výdavku: " + chlieb.getNazov());
        System.out.println("Cena: " + chlieb.getCena());
        System.out.println("Kategória: " + chlieb.getKategoria());
    }
}
