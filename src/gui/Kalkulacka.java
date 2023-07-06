package gui;

import javax.swing.*;
import java.awt.*;

public class Kalkulacka {
    public static void main(String[] args) {
        JFrame hlavneOkno = new JFrame("Kalkulačka v1.0");
        hlavneOkno.setMinimumSize(new Dimension(400, 300));
        //TODO Ako nastavit maximalizovane okno automaticky po spusteni aplikacie
        hlavneOkno.setResizable(false); // Zakazali sme moznost zmeny velkosti okna
        hlavneOkno.setLocationRelativeTo(null); // Vycentruje okno, resp. JFrame voci obrazovke, aj horizontalne, aj vertikalne
        hlavneOkno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Pokracujeme vytvaranim panela
        JPanel panel = new JPanel();
        panel.setLayout(null); // Panel bude bez akehkolvek layout-u

        hlavneOkno.setContentPane(panel); // Do okna, teda JFrame tymto sposobom pridavame panel

        // Pre korektne zobrazenia okna, cize jFrame pouzijeme tieto dva prikazy (vid nizsie)
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }
}
