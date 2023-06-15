package ulohy;

public class Cykly2 {
    public static void main(String[] args) {
        int cislo = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(cislo + "\t");
                cislo *= 2;
            }
            System.out.println();
        }
    }
}
