package oop.polymorfizmus.model;

public class Kon extends Zviera {
    private int pocetKopyt;

    public Kon(String meno, int pocetKopyt) {
        super(meno);
        this.pocetKopyt = pocetKopyt;
    }

    @Override
    public void ozyvasa() {
        System.out.println("Kôň erdží!");
    }
}
