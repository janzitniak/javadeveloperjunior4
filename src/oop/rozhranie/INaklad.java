package oop.rozhranie;

public interface INaklad {
    final static double DPH = 0.20;

    void vypis();
    void vytlac();
    void zoznamNakladov();
    double celkoveNaklady();
    void exportDoPDF();
}
