package test;

/*
ZADANIE:
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).

Vytvorte jUnit testy, ktore otestuju funkcnost metod vypocitajObvod a vypocitajObsah

*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.ObjLongConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Obdlznik {

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        double a = 2.5; // Strana a
        double b = 3.5; // Strana b

        System.out.println("Obvod obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));

    }

    @Test
    @DisplayName("Testy na vypocet obvodu")
    public void testVypocitajObvod() {
        assertEquals(10.0, Obdlznik.vypocitajObvod(2.0, 3.0));
        assertEquals(13, Obdlznik.vypocitajObvod(2.5, 4));
    }

    @Test
    @DisplayName("Testy na vypocet obsahu")
    public void testVypocitajObsah() {
        assertEquals(6, Obdlznik.vypocitajObsah(2,3));
        assertEquals(10, Obdlznik.vypocitajObsah(5,2));
    }

}
