public class JavaDoc {

    /**
     * Scita dve zadane desatinne cisla.
     * Ohladom toho, ako funguje scitanie sa mozete dozvediet na <a href="https://sk.wikipedia.org/wiki/S%C4%8D%C3%ADtanie">https://sk.wikipedia.org/wiki/S%C4%8D%C3%ADtanie</a>
     *
     * @param a akekolvek desatinne cislo
     * @param b akekolvek desatinne cislo
     * @return  vrati scitanie 2 cisiel
     * @see <a href="https://sk.wikipedia.org/wiki/S%C4%8D%C3%ADtanie">Scitanie na Wikipedii</a>
     */
    public static double scitaj(double a, double b) {
        return a+b;
    }

    /**
     * Odcita dve zadane desatinne cisla.
     * Ohladom toho, ako funguje odcitanie sa mozete dozvediet na <a href="https://sk.wikipedia.org/wiki/Od%C4%8D%C3%ADtanie">https://sk.wikipedia.org/wiki/Od%C4%8D%C3%ADtanie</a>
     *
     * @param a akekolvek desatinne cislo
     * @param b akekolvek desatinne cislo
     * @return  vrati scitanie 2 cisiel
     * @see <a href="https://sk.wikipedia.org/wiki/Od%C4%8D%C3%ADtanie">Odcitanie na Wikipedii</a>
     */
    public static double odcitaj(double a, double b) {
        return a+b;
    }

    /**
     * Nasobi dve zadane desatinne cisla.
     * Ohladom toho, ako funguje nasobenie sa mozete dozvediet na <a href="https://sk.wikipedia.org/wiki/N%C3%A1sobenie">https://sk.wikipedia.org/wiki/N%C3%A1sobenie</a>
     *
     * @param a akekolvek desatinne cislo
     * @param b akekolvek desatinne cislo
     * @return  vrati nasobenie 2 cisiel
     * @see <a href="https://sk.wikipedia.org/wiki/N%C3%A1sobenie">Násobenie na Wikipedii</a>
     */
    public static double nasob(double a, double b) {
        return a*b;
    }

    /**
     * Metoda na delenie dvoch cisel.
     *
     * @param a delenec
     * @param b delitel
     * @return podiel cisel
     * @throws ArithmeticException ak je delitel nulovy
     */
    public static double del(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Nulový deliteľ nie je povolený.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        scitaj(2, 3);
        odcitaj(2, 3);
        nasob(2, 3);
        del(2, 3);
    }
}