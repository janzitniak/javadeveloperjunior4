package ulohy;

public class Test {
    public static void main(String[] args) {
        double cislo1 = 4.5;
        double cislo2 = 3.8;
        double sum = ZakladneMatematickeOperacieCezMetody.scitaj(cislo1, cislo2);
        System.out.printf("\nVýsledkom sčítania čísiel %.2f a %.2f je: %.2f", cislo1, cislo2, sum);
    }
}
