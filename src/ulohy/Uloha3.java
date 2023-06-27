package ulohy;

import java.util.Scanner;

// Kalkulacka
public class Uloha3 {
    // Moje vlastne metody
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;

        System.out.println("Kalkulacka");
        System.out.println("Zadaj prve cislo: ");
        a = Float.parseFloat(scanner.nextLine()); // TODO scanner.nextFloat();
        System.out.println("Zadaj druhe cislo: ");
        b = Float.parseFloat(scanner.nextLine());

        System.out.println("Vyber si operaciu");
        System.out.println("1 - scitanie");
        System.out.println("2 - odcitanie");
        System.out.println("3 - nasobenie");
        System.out.println("4 - delenie");
        System.out.println("5 - modulo");
        System.out.println("Zadaj operaciu: ");
        String operation = scanner.nextLine();
        switch (operation){
            case "1" -> sum(a, b);
            case "2" -> minus(a, b);
            case "3" -> multi(a, b);
            case "4" -> divide(a, b);
            case "5" -> modulo(a, b);
            default -> System.out.println("Neplatna operacia!");
        }
    }

    protected static float sum(float a, float b){
        return a + b;
        //System.out.printf("Vysledok scitania je %.2f\n", (a + b));
    }

    public static void minus(float a, float b){
        System.out.printf("Vysledok odcitania je %.2f\n", (a - b));
    }

    public static void multi(float a, float b){
        System.out.printf("Vysledok nasobenia je %.2f\n", (a * b));
    }

    public static void divide(float a, float b){
        if(b == 0)
            System.out.printf("Nejde delit nulou!");
        System.out.printf("Vysledok delenia je %.2f\n", (a / b));
    }

    public static void modulo(float a, float b){
        System.out.printf("Vysledok zvysku je %f\n", (a % b));
    }


}
