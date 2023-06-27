import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatumPriklad {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.now(); // Aktualny datum
        System.out.println(lc);

        LocalDate lc1 = LocalDate.of(2023, 6,20); // Konkretny datum
        System.out.println(lc1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = lc1.format(dateTimeFormatter);  //17-02-2022

        System.out.println(formattedDate);

    }
}
