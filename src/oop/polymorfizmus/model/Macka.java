package oop.polymorfizmus.model;

public class Macka extends Zviera {
    private int dlzkaFuzov;

    public Macka(String meno, int dlzkaFuzov) {
        super(meno);
        this.dlzkaFuzov = dlzkaFuzov;
    }

    @Override
    public void ozyvasa() {
        System.out.println("Mačka mňauká!");
    }
}
