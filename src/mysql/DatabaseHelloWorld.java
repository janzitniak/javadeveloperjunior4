package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class DatabaseHelloWorld {

    public static void odstran(Connection conn) throws SQLException {
        // the mysql insert statement
        String query = "DELETE FROM knihy WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, 2); // Zmazeme zaznam s id = 2
        // execute the preparedstatement
        preparedStmt.execute();
        System.out.println("Záznam bol odstránený!");
    }

    public static void vloz(Connection conn) throws SQLException {
// the mysql insert statement
        String query = "INSERT INTO knihy (nazov, autor, rok_vydania) VALUES (?, ?, ?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString (1, "Rozprávky pre deti 4");
        preparedStmt.setString(2, "Pavol Dobšinský");
        preparedStmt.setInt(3, 1901);
        // execute the preparedstatement
        preparedStmt.execute();
        System.out.println("Záznam bol uložený");
    }

    // R ako READ, cize vyber data, priamo sa pouziva ale SQL prikaz SELECT
    public static void vyber(Connection conn) throws SQLException {
        String query = "SELECT id, nazov, autor, rok_vydania FROM knihy"; // SQL query na vyber vsetkych stlpcov a jej udajov z tabulky knihy
        // String query = "SELECT id, nazov, autor, rok_vydania FROM knihy"; // Je to ekvivalent SQL query uvedeneho vyssie

        PreparedStatement preparedStmt = conn.prepareStatement(query); // Vytvarame PreparedStatement, resp. pripravujeme SQL query na jeho uskutocnenie
        ResultSet rs = preparedStmt.executeQuery(query); // Tu sa priamo uz dane SQL vykona, vysledkom je ResultSet, ktory obsahuje jednotlive zaznamy, resp. riadky tabulky ...


        // ... a nasledne prechadzame jednotlivymi zaznamami
        while (rs.next())
        {
            int id = rs.getInt("id");
            String nazov = rs.getString("nazov");
            String autor = rs.getString("autor");
            int rokVydania = rs.getInt("rok_vydania");

            // Vypiseme vybrane udaje
            System.out.println("\nId knihy je: " + id);
            System.out.println("Názov knihy je: " + nazov);
            System.out.println("Autor knihy: " + autor);
            System.out.println("Rok vydania: " + rokVydania);
        }
        preparedStmt.close();
    }

    public static void aktualizuj(Connection conn) throws SQLException {
        // create the java mysql update preparedstatement
        String query = "UPDATE knihy SET nazov = ?, autor = ?, rok_vydania = ? WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, "Hobit, škriatok"); // Pre prvy otaznik sme nastavili nazov
        preparedStmt.setString(2, "Jožko Mrkvička");
        preparedStmt.setInt(3, 1990);
        preparedStmt.setInt(4, 3); // Pre stvrty otaznik sme nastavili id knihy pre jej aktualizaciu
        // execute the java preparedstatement
        preparedStmt.executeUpdate();
        System.out.println("Záznam aktualizovaný!");
    }

    public static void main(String[] args) throws SQLException {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/kniznica_db";
        String username = "root";
        String password = "password";
        System.out.println("Connecting database...");
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        System.out.println("Výber všetkých záznamov z tabuľky Knihy, jedná sa o operácie R ako READ");
        vyber(conn);

        System.out.println("Aktualizuj konkrétny záznam");
        aktualizuj(conn);

        System.out.println("Vlož konkrétny záznam");
        vloz(conn);

        odstran(conn);

        conn.close();

    }
}


