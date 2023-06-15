import java.util.Arrays;

public class Polia {

    public static void zoradPole(double [] cisla) {
        Arrays.sort(cisla);
    }

    public static void main(String[] args) {
        String[] bicycles; // Prazdne pole
        String [] cars  = {"Volvo", "BMW", "Ford", "Mazda", "Škoda"};
        System.out.println(cars[0]); // Vypise Volvo, prvy zaznam v poli je oznaceny indexom O
        System.out.println(cars[3]); // Vypise Mazda

        // TODO Ako vypisat obsah pola
        // System.out.println(cars); // Toto nam nevypise ocakavany vysledok, cize nevypise obsah pola

        System.out.println("\nPrvý spôsob ako vypísať obsah poľa");
        // Prvy sposob, prostrednictvom cyklus s pevnym poctom opakovani
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("\nDruhý spôsob ako vypísať obsah poľa");
        // Druhy sposob, prostrednictvom foreach
        for(String car:cars) {
            System.out.println(car);
        }

        // Doplnit "staticke" pole nie je jednoznacna cesta

        double [] cisla = {100, 2.5, 4, 8.5, 10}; // Vytvorili sme pole s desatinnymi cislami
        double [] cislaKopia = cisla.clone(); // Vytvorili sme nezavislu kopiu pola cisel

        //Arrays.sort(cisla); // Cisla usporiadane od najmensieho po najvacsie
        zoradPole(cisla);
        System.out.println("\nVypisujem čísla po zoradení: ");
        for (double cislo:cisla) {
            System.out.println(cislo);
        }

        System.out.println("\nVypisujem čísla kópie poľa čisla");
        for (double cisloKopia:cislaKopia) {
            System.out.println(cisloKopia);
        }

    }
}
