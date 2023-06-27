package oop.konstruktory;

public class Hracka {
    // material, velkost, farba, cena, vek
    // atributy triedy = premenne triedy = class fields
    private String material;
    private String farba;
    private double cena;
    private String vekoveUrcenie;
    private String nazov;

    // Vytvorili sme konstruktor bez parametrov
    public Hracka() {
/*        nazov = "Žiadny";
        farba = "-";
        material = "Výrobca neuvádza"; // V pripade ziadneho zobrazenia textu sa pouzivaju dve uvodzovky ""
        // material = ""; // Zobrazi sa "prazdny" text
        vekoveUrcenie = "Výrobca neuvádza";
        cena = 10.00;*/
    }

    // Konstruktor s parametrami
    // Ak mame min. 2 konstruktory, ktore sa lisia poctom parametrov, resp. jeden z nich je bez parametrov tak im hovorime aj, ze su pretazene
    public Hracka(String material, String farba, double cena, String vekoveUrcenie, String nazov) {
        this.material = material;
        this.farba = farba;
        this.cena = cena;
        this.vekoveUrcenie = vekoveUrcenie;
        this.nazov = nazov;
    }

    // Konstruktor s niekolkymi parametrami, vynechana cena
    public Hracka(String material, String farba, String vekoveUrcenie, String nazov) {
        this.material = material;
        this.farba = farba;
        this.vekoveUrcenie = vekoveUrcenie;
        this.nazov = nazov;
        this.cena = 10.00;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getVekoveUrcenie() {
        return vekoveUrcenie;
    }

    public void setVekoveUrcenie(String vekoveUrcenie) {
        this.vekoveUrcenie = vekoveUrcenie;
    }

    @Override
    public String toString() {
        return "\nInformácie o hračke:\nMateriál: " + material + "\nFarba: " + farba + "\nCena: " + cena + "\nVekové určenie " + vekoveUrcenie + "\nNázov: " + nazov;
    }



/*    @Override
    public String toString() {
        return "Hracka{" +
                "material='" + material + "\"" +
                ", farba='" + farba + '\'' +
                ", cena=" + cena +
                ", vekoveUrcenie='" + vekoveUrcenie + '\'' +
                ", nazov='" + nazov + '\'' +
                '}';
    }*/
}
