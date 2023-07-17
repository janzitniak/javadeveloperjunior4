package oop.evidenciazamestnancov;

public class Oddelenie {
    private String nazov;
    private int poschodie;

    public Oddelenie() {
    }

    public Oddelenie(String nazov, int poschodie) {
        this.nazov = nazov;
        this.poschodie = poschodie;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPoschodie() {
        return poschodie;
    }

    public void setPoschodie(int poschodie) {
        this.poschodie = poschodie;
    }

    @Override
    public String toString() {
        return "Oddelenie{" +
                "nazov='" + nazov + '\'' +
                ", poschodie=" + poschodie +
                '}';
    }
}
