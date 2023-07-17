package oop.dedicnost;

public class Cicavec extends SuperCicavec {
    protected boolean jeDomace = false;

    public void steka() {
        System.out.println("Hav, hav!");
    }

    public void sajeMlieko() {
        System.out.println("Saje mlieko");
    }

    public final void neprepisatelnaMetoda() {
        System.out.println("Tuto metodu nepojde prepisat v potomkovi!");
    }

    private void nededitelnaMetoda() {
        System.out.println("Nepojde ju dedit!");
    }

}
