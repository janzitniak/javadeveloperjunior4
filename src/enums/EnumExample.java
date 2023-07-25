package enums;

public class EnumExample {

    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }

    public static void main(String[] args) {

        // Príklad prístupu k hodnote ENUMu
        Season currentSeason = Season.SUMMER;
        System.out.println("Aktuálna sezóna: " + currentSeason);

        // Porovnanie ENUM hodnôt
        if (currentSeason == Season.SUMMER) {
            System.out.println("Je leto!");
        } else {
            System.out.println("Nie je leto.");
        }

        // Iterovanie cez všetky hodnoty ENUMu
        System.out.println("Všetky sezóny:");
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}

