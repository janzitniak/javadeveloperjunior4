import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPriklad {

    public static void vypisObsahArrayList(ArrayList dynamickePole) {
        // Vypise obsah ArrayList cez foreach, v cykle pouzivame rovnaky datovy typ ako v ArrayList (=dynamickom poli)
        for(Object hodnota:dynamickePole) {
            System.out.println(hodnota);
        }
    }

    public static void main(String[] args) {
        // Vytvor mi ArrayList, ktory bude obsahovat len Stringy ohladom aut
        // ArrayList je trieda, ktora obsahuje v sebe len objekty. T.j. nemohli by sme do nej ukladat int, double, boolean, char, ...
        // Kedze String je objekt, mozeme ho do ArrayListu vlozit
        ArrayList<String> auta = new ArrayList<>();

        // Pridaj do ArrayListu 3 auta
        auta.add("Ferrari");
        auta.add("Lamborghini");
        auta.add("Porsche");

        // Vypis vsetky auta, ktore sa nachadzaju v ArrayListe, pomocou foreach cyklu
        for (String auto : auta) {
            System.out.println(auto);
        }

        // Vypis kolko aut sa nachadza v ArrayListe
        System.out.println(auta.size());

        // Vymaz prvy prvok z ArrayListu
        auta.remove(0);

        // Vypis vsetky auta, ktore sa nachadzaju v ArrayListe
        for (Object auto : auta) {
            System.out.println(auto);
        }

        // Vymaz vsetky prvky z ArrayListu
        // auta.clear();

        // Vypis kolko aut sa nachadza v ArrayListe
        System.out.println(auta.size());

        // Ukazka ArrayList, ktory pracuje s celymi cislami
        ArrayList <Integer> celeCisla = new ArrayList<>();
        celeCisla.add(1);
        celeCisla.add(8900);
        celeCisla.add(1876786768);

        ArrayList<Long> velmiVelkeCeleCisla = new ArrayList<>();
        velmiVelkeCeleCisla.add(12372893798908908l); // V pripade Long je potrebne k cislu pridat postfix l

        ArrayList<Character> znaky = new ArrayList<>();
        znaky.add('a');
        znaky.add('b');
        znaky.add('c');

        ArrayList<Double> desatinneCisla = new ArrayList<>();
        desatinneCisla.add(2.3);
        desatinneCisla.add(4.87987);
        desatinneCisla.add(565675675.8787);
        desatinneCisla.add(-1.0);
        desatinneCisla.add(-2.0);

/*        for (int i = 0; i < desatinneCisla.size(); i++) {
            System.out.println(desatinneCisla.get(i));
        }

        for(Object desatinneCislo:desatinneCisla) {
            System.out.println(desatinneCislo);
        }*/

        // Vypise obsah ArrayList cez metodu
        vypisObsahArrayList(desatinneCisla);
        vypisObsahArrayList(znaky);
        vypisObsahArrayList(auta);
        vypisObsahArrayList(celeCisla);

        ArrayList<Object> rozneHodnoty = new ArrayList();
        rozneHodnoty.add("Jano"); // Index 0
        rozneHodnoty.add(2.6); // Index 1
        rozneHodnoty.add('*'); // Index 2
        rozneHodnoty.add(7.8); // Index 3

        //vypisObsahArrayList(rozneHodnoty);

        System.out.println("Sčítavam obsah konkrétnych položiek rozneHodnoty:");
        System.out.println((Double)rozneHodnoty.get(1) + (Double)rozneHodnoty.get(3)); // metoda .get mi vrati konkretny zaznam z ArrayList

        // Úloha: Nacitaj hodnoty z "konzoly" a uloz ich do ArrayList
        ArrayList<Double> zadaneDesatinneCisla = new ArrayList<>(); // Inicializacia ArrayList, neobsahuje ziadnu hodnotu

        System.out.println("Prosím zadaj desatinné číslo:");
        Scanner scn = new Scanner(System.in); // Inicializacia scanner pre pouzivatelsky vstup z konzoly
        Double desatinneCislo = scn.nextDouble();  // Konkretny vstup od pouzivala, ulozi ho ako desatinne cislo Double

        zadaneDesatinneCisla.add(desatinneCislo); // Zadane desatinne cislo nasledne ukladame do ArrayList
        //vypisObsahArrayList(zadaneDesatinneCisla);
        for(Double zadaneDesatinneCislo:zadaneDesatinneCisla) {
            System.out.println(zadaneDesatinneCislo);
        }
    }
}
