public class IfPriklad {
    public static void main(String[] args) {
        int i = 3;
        int j = 6;

        if (i == 3 && j == 7) // && reprezentuje AND, cize musia plati vsetky podmienky
            System.out.println("Platí, že i=3 a j=7");

        if (i == 3 || j == 7) // || reprezentuje ALEBO, cize staci, ked plati aspon 1 podmienka, vtedy sa if vykona
            System.out.println("Platí, že i=3 alebo j=7");

    }
}
