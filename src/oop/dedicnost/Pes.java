package oop.dedicnost;

public class Pes extends Cicavec {
    public boolean jeDomace = true;

    @Override
    public void sajeMlieko() {
        System.out.println("Pes ");
        super.sajeMlieko();
    }

    public void strazi() {
        System.out.println("Pes stráži dvor");
    }

}
