package ulohy;/*
Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+),
odčítanie (-), násobenie (*) a delenie (/), modulo (%).

        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
*/

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 5;
        double cislo2 = 2;

        double scitanie = cislo1 + cislo2;
        double odcitanie = cislo1 - cislo2;
        double nasobenie = cislo1 * cislo2;
        double delenie = cislo1 / cislo2;
        double modulo = cislo1 % cislo2; // % reprezentuje zvysok po deleni, cize modulo

        System.out.println("Výsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
        System.out.println("Výsledkom odčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + odcitanie);
        System.out.println("Výsledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je " + nasobenie);
        System.out.println("Výsledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je " + delenie);
        System.out.println("Výsledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + modulo);

        // Odcitanie so zaokruhlenim, resp. vypisanim do konzoly spolu so zaokruhlenim
        // Namiesto %.2f co reprezentuje cislo zaokruhlene na 2 desatinne cisla mozeme pouzit ine cislo, napr. %.1f
        // co zaokruhli cislo v konzole na 1 desatine miesto
        System.out.printf("\n\tVýsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
        System.out.printf("\n\tVýsledkom odčítania hodnôt %.2f a %.2f je %.2f ", cislo1, cislo2, odcitanie);
        System.out.printf("\n\tVýsledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je " + nasobenie);
        System.out.printf("\n\tVýsledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je " + delenie);
        System.out.printf("\n\t'Výsledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + modulo);

        // Escape characters:
        // \n   reprezentuje dalsi riadok
        // \t   reprezentuje tabulator
        // \'   zobrazi apostrof

        // TODO Zobrazit akykolvek text, v ktorom sa nachadzaju uvodzovky.
        // TODO Priklad - vypíš do konzoly tento text: Táto hora je "vraj" najvyššia!
        System.out.println("\nTáto hora je \"vraj\" najvyššia!");
        System.out.println("Chcem vypísať lomku \\");

        // Vypís rozne texty s pouzitim vsetkych escape znakov
        // GitHub Copilot = umelá inteligencia od GitHub

    }
}