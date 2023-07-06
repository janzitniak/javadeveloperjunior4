package gui;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulacka {
    public static void main(String[] args) {

        //TODO Nastavit jednotne vzhlad aplikacie pre rozne OS
        try {
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }



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

        // Pokracujeme vytvaranim textoveho pola, cize pola, kde moze pouzivatel pisat
        JTextField vstupneOkno = new JTextField();
        vstupneOkno.setBounds(20, 40, 360, 20); // Nastavili sme rozmery textove pola pre vzorec
        vstupneOkno.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(vstupneOkno);

        // Vytvorenie tlacidla s oznacenim 0
        JButton tlacidlo0 = new JButton("0"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo0.setBounds(20, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "0");
            }
        });

        // Vytvorenie tlacidla s oznacenim 1
        JButton tlacidlo1 = new JButton("1"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo1.setBounds(70, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "1");
            }
        });

        // TODO Vytvorme tlacidla pre cislo 2; vypoctove operatory ako su + -; rovna sa = pre vypocet; C pre vymazanie obsahu;

        // Vytvorenie tlacidla s oznacenim 2
        JButton tlacidlo2 = new JButton("2"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo2.setBounds(120, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "2");
            }
        });

        // Vytvorenie tlacidla s oznacenim 2
        JButton tlacidloPlus = new JButton("+"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidloPlus.setBounds(170, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "+");
            }
        });



        // Pridavame jednotlive tlacidla do JPanel
        panel.add(tlacidlo0);
        panel.add(tlacidlo1);
        panel.add(tlacidlo2);
        panel.add(tlacidloPlus);

        // Pre korektne zobrazenia okna, cize jFrame pouzijeme tieto dva prikazy (vid nizsie)
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }
}
