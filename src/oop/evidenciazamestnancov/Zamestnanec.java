package oop.evidenciazamestnancov;

import java.time.LocalDate;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private LocalDate datumNarodenia;
    private boolean jeVeduci;
    private Oddelenie oddelenie;

    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko, LocalDate datumNarodenia, boolean jeVeduci, Oddelenie oddelenie) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNarodenia = datumNarodenia;
        this.jeVeduci = jeVeduci;
        this.oddelenie = oddelenie;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public LocalDate getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(LocalDate datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public boolean isJeVeduci() {
        return jeVeduci;
    }

    public void setJeVeduci(boolean jeVeduci) {
        this.jeVeduci = jeVeduci;
    }

    public Oddelenie getOddelenie() {
        return oddelenie;
    }

    public void setOddelenie(Oddelenie oddelenie) {
        this.oddelenie = oddelenie;
    }

    @Override
    public String toString() {
        return "Zamestnanec{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", datumNarodenia=" + datumNarodenia +
                ", jeVeduci=" + jeVeduci +
                ", oddelenie=" + oddelenie +
                '}';
    }
}
