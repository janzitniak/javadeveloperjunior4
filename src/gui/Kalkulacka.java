package gui;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulacka {

    // posledne2ZnakyZadanehoVzorca obsahuju 2 znaky alebo "", teda je prazdny
    public static boolean jePovoleneCislo(String posledne2ZnakyZadanehoVzorca) {
        if (! (posledne2ZnakyZadanehoVzorca.equals("+0") || posledne2ZnakyZadanehoVzorca.equals("-0")) ) {
            return true;
        } else
            return false;
    }

    public static String ziskajPosledne2Znaky(String text) {
        // TODO Ako sa vyvarovat chybe, ked mame prazdny text alebo text obsahuje 1 znak
        if (text.length() > 1)
            return text.substring(text.length()-2); // Vrati 2 posledne znaky
        else
            return ""; // Alebo vrati prazdny retazec, teda "nic"
    }

    public static boolean jeNaZaciatku0(String text) {
        if (text.length() == 1 && text.equals("0"))
            return true;
        else
            return false;
    }

    public static void vypisHodnotu(JTextField vstupneOkno, String hodnota) {
        // TODO Zefektivnit podmienku s ohladom na opakujuci kod vstupneOkno.setText ...
        /*                if ( jeNaZaciatku0( vstupneOkno.getText() ) || jePovoleneCislo(ziskajPosledne2Znaky(vstupneOkno.getText()) ) ) {
                    vstupneOkno.setText(vstupneOkno.getText().substring(0, vstupneOkno.getText().length() - 1) + "2");
                } else
                    vstupneOkno.setText(vstupneOkno.getText() + "2");*/
        if (!jeNaZaciatku0(vstupneOkno.getText())) {
            if (jePovoleneCislo(ziskajPosledne2Znaky(vstupneOkno.getText())))
                vstupneOkno.setText(vstupneOkno.getText() + hodnota);
            else
                vstupneOkno.setText(vstupneOkno.getText().substring(0, vstupneOkno.getText().length() - 1) + hodnota);
        } else
            vstupneOkno.setText(vstupneOkno.getText().substring(0, vstupneOkno.getText().length() - 1) + hodnota);
    }

    public static void main(String[] args) {

        // TODO Nastavit jednotny vzhlad aplikacie pre rozne OS
        try {
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }



        JFrame hlavneOkno = new JFrame("Kalkulačka v1.0");
        hlavneOkno.setMinimumSize(new Dimension(400, 300));
        // TODO Ako nastavit maximalizovane okno automaticky po spusteni aplikacie
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

        JLabel copyright = new JLabel("(c) Ján Žitniak");
        copyright.setBounds(40, 70, 300, 20);
        panel.add(copyright);

        // TODO Ako vyriesit problem so zobrazovanim viacerych 0, ked su zobrazovane za sebou ale ako samostatne cislo, cize tento problem: 00
        // Scenare:
        // 1.Konkretny priklad 12+0
        // Riesenie: Budeme testovat posledne 2 znaky a ak obsahuju +0 alebo -0 alebo *0 alebo /0, tak dovolim vypisat iba desatinnu bodku alebo dalsie znamienka, prip. rovna sa alebo C (clear)
        // 2.Konkretny priklad 0
        // Riesenie: Budeme testovat ci zadany text ma dlzku 1 znaku a zaroven ak obsahuje 0, tak dovolim vypisat iba desatinnu bodku alebo dalsie znamienka, prip. rovna sa alebo C (clear)

        // Vytvorenie tlacidla s oznacenim 0
        JButton tlacidlo0 = new JButton("0"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo0.setBounds(20, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vypisHodnotu(vstupneOkno, "0");
            }
        });

        // Vytvorenie tlacidla s oznacenim 1
        JButton tlacidlo1 = new JButton("1"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo1.setBounds(70, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vypisHodnotu(vstupneOkno, "1");
            }
        });


        // Vytvorenie tlacidla s oznacenim 2
        JButton tlacidlo2 = new JButton("2"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidlo2.setBounds(120, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vypisHodnotu(vstupneOkno, "2");
            }
        });

        // Vytvorenie tlacidla s oznacenim +
        JButton tlacidloPlus = new JButton("+"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidloPlus.setBounds(170, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "+");
            }
        });

        // Vytvorenie tlacidla s oznacenim -
        JButton tlacidloMinus = new JButton("-"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidloMinus.setBounds(220, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText() + "-");
            }
        });


        // Vytvorenie tlacidla s oznacenim C (pre vymazanie obsahu vstupneho okna)
        JButton tlacidloC = new JButton("C"); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidloC.setBounds(270, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(""); // "" reprezentuje prazdny text, resp. prazdny textovy retazec
            }
        });


        // Vytvorenie tlacidla s rovna sa (=), ktore vypocita dany vzorec
        JButton tlacidloRovnaSa = new JButton("="); // Vytvorili sme tlacidlo s oznacenim 0
        tlacidloRovnaSa.setBounds(320, 200, 40, 40); // Umiestnili sme ho na urcitu poziciu a nastavili sirku a vysku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloRovnaSa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("nashorn");
                String vzorec = vstupneOkno.getText();
                try {
                    vstupneOkno.setText(engine.eval(vzorec).toString()); // vysledok Stringu, ktory obsahuje vzorec vypisem
                } catch (ScriptException e1) {
                    throw new RuntimeException(e1);
                }
            }
        });

        // (1+2)+(2*3)

        // Pridavame jednotlive tlacidla do JPanel
        panel.add(tlacidlo0);
        panel.add(tlacidlo1);
        panel.add(tlacidlo2);
        panel.add(tlacidloPlus);
        panel.add(tlacidloMinus);
        panel.add(tlacidloC);
        panel.add(tlacidloRovnaSa);

        // Pre korektne zobrazenia okna, cize jFrame pouzijeme tieto dva prikazy (vid nizsie)
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }
}
