package ulohy;

public class ScitajCislaVPoli {

    public static double getSum(double []cisla) {
        double sum = 0;
        for (double cislo:cisla) {
            sum += cislo;
        }
        return sum;
    }

    public static void main(String[] args) {
        double []cisla = {1.5, 2.9, 3.0, 4, 5};
        System.out.println(getSum(cisla));
    }
}
