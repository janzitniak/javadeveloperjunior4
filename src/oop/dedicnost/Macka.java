package oop.dedicnost;

public class Macka extends Cicavec {
    public boolean jeDomace = true;
    @Override
    public void sajeMlieko() {
        //System.out.println("Mačka saje mlieko");
        super.sajeMlieko();
    }

    @Override
    public void steka() {
        System.out.println("Mňau, mňau!");
    }

    public void chytaMysi() {
        System.out.println("Mačka chytá myši");
    }
}
