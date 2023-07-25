package enums;

public class OblubenaFarbaMain {
    public static void main(String[] args) {
        String mojaOblubenaFarba = Farba.ČERVENÁ.toString();
        System.out.println("Moja obľúbená farba je: " + mojaOblubenaFarba);

        String ponukanaFarbaVozidla = Farba.MODRÁ.toString();

        Farba cervena = Farba.ČERVENÁ;
        System.out.println("Ponúkaná farba vozidla je: " + Farba.ČERVENÁ);

        Farba dalsiaFarba = Farba.RUŽOVÁ;
        System.out.println("Ďalšia ponúkaná farba vozidla je: " + Farba.RUŽOVÁ);
    }
}
