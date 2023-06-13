package ulohy;

/*
Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.
        Typická hra fizz buzz môže začínať takto:

        1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …
*/
public class FizzBuzz {
    public static void main(String[] args) {
        final int MAX = 100; // Konstanta je deklarovana prostrednictvom klucoveho slova final
        // MAX = 99; // Konstantu nemozne hodnotovo prepisat
        for (int number = 1; number <= MAX; number++) {
            if (number % 3 == 0)
                System.out.println("Fizz");
            if (number % 5 == 0)
                System.out.println("Buzz");
            if (number % 3 !=0 && number % 5 !=0)
                System.out.println(number);
        }
    }
}
