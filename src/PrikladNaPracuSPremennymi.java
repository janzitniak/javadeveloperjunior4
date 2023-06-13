/*
Úloha č.1: Príklad na prácu s premennými
Vypíšte do konzoly nasledujúci text:
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
V Bratislave dňa 18.06.2022

Poznámka: Meno študenta + dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrikladNaPracuSPremennymi {

    public static void main(String[] args) {
        // primitivne datove typy su: int, double, float, boolean
        // neprimitivne datovy typ je: String, Boolean, Double, Float, Integer

        String menoStudenta = "Jozef Mrkvička";
        String datumNarodenia = "03.04.2000";

        double znamka = 1.5;
        String od = "septembra 2022";

        Date datum = new Date(); // Date je trieda, ktora reprezentuje
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Študent " + menoStudenta + " sa narodil " + datumNarodenia + ", z maturitnej skúšky má známku " + znamka + " a od " + od + " nastúpi do nového zamestnania ako Java programátor.");
        System.out.println("V Bratislave dňa " + formatDatumu.format(datum));


        LocalDate localDate = LocalDate.of(2014, Month.FEBRUARY, 11); // Naplnime premennu localDate konkretnym datumom
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        System.out.println("Vypisujem localDate: " + localDate.format(formatter));

        // TODO Vypiste znamku vo formate, ktory je akceptovatelny pre Slovaka, cize zobrazime desatinnu ciarku
        System.out.printf("Študent %S má známku %.1f", menoStudenta, znamka);

    }
}
