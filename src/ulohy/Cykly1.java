package ulohy;

public class Cykly1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("\t" + (5 * i + j));
            }
            System.out.println();
        }
    }
}
