import test.Obdlznik;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPriklad {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        //double a = 2.5; // Strana a
        //double b = 3.5; // Strana b
        double a = 0;
        double b = 0;
        while (true) {
            Scanner scn = new Scanner(System.in); // Inicializacia konzoly (System.in) cez triedu Scanner
            try { // "Osetretnie chyby"
                System.out.println("Zadaj stranu a");
                a = scn.nextDouble();
                System.out.println("Zadaj stranu b");
                b = scn.nextDouble();
                System.out.println("Obvod obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
                System.out.println("Obsah obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));
                break; // Ukonci while
            } catch (InputMismatchException e) {
                // Tu dopisem vlastny kod, ktory naraba s chybou
                System.out.println("Chyba vo vstupných hodnotách!");
                //e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Neznáma chyba!");
                //e.printStackTrace();
            } finally {
                System.out.println("Volá sa kód automaticky, ktorý sa nachádza vo finally.");
                //System.out.println("Uzatváram vstupy cez Scanner.");
                //scn.close();
                //break;
            }
        }

        System.out.println("Delím 0-lou");

        try {
            double delenie = a / 0;
            System.out.println("Výsledok delenia je: " + delenie);
        } catch (ArithmeticException e) { // Exception je rodic vsetkych exceptions, lepsie je konkretizovat
            System.out.println("Problém s delením");
        }


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Odkazujete sa na prvok poľa mimo rozsah.");
        }


        checkAge(20); // Set age to 15 (which is below 18...)


        int fileNumber = 1;
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
                String newFileName = "filename" + fileNumber + ".txt";
                File myObj2 = new File(newFileName);
                myObj2.createNewFile(); // Fyzicke vytvorenie suboru
                //if (myObj2)
                fileNumber++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
