import java.util.Scanner;

public class VarPriklad {
    public static void main(String[] args) {
        var cislo = 10; // Toto moze sposobit "necitatelnost" kodu
        // int cislo = 5; // Toto nepojde, lebo cislo je uz zadefinovane
        //String cislo = "10";
        System.out.println("Zadefinoval si toto cislo cez var: " + cislo);

        var nejakyText = "výborný";
        var spolu = nejakyText + cislo;
        System.out.println("Spolu je: " + spolu);

        Scanner sc = new Scanner(System.in); // Inicializacia Scanner-a
        var vstupZKonzoly = sc.nextInt();


/*        cislo = "Desať"; // Pretypovanie hodnotou nepojde
        nejakyText = 1;*/ // Pretypovanie hodnotou nepojde










        System.out.println(vstupZKonzoly);
    }
}
