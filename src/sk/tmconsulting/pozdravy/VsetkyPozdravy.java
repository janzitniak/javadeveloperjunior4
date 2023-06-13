package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

import java.util.Scanner;

public class VsetkyPozdravy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte svoje meno: ");
        String meno = sc.nextLine();

        Hello.pozdravujem(meno); // Pozdravi aj menom
        Szia.pozdravujem();
        Hallo.pozdravujem();
        Ahoj.pozdravujem();
    }
}
