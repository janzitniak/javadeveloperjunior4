package oop.polymorfizmus.model;

public class Pes extends Zviera {
    private int dlzkaChvosta;

    public Pes(String meno, int dlzkaChvosta) {
        super(meno);
        this.dlzkaChvosta = dlzkaChvosta;
    }

    @Override
    public void ozyvasa() {
        System.out.println("Pes kuše!");
    }
}
