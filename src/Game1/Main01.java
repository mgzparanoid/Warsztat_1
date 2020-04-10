package Game1;

import java.util.Random;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(100-1) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number from 1 to 100: ");
        int counter = 0;
        while (true) {
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("Not a number.");
            }

            int chosenNumber = scan.nextInt();
            counter++;
            if (chosenNumber > randomNumber) {
                System.out.println("Try lower, enter again: ");
            } else if (chosenNumber < randomNumber) {
                System.out.println("Try higher, enter again: ");
            } else {
                System.out.println("You guessed right. The number is: " +
                        chosenNumber);
                System.out.println("It took you " + counter + " tries.");
                break;
            }
        }
    }
}


//        while (true) {
//            if (chosenNumber == randomNumber) {
//                System.out.println("You guessed it right!");
//                break;
//            } else if (chosenNumber > randomNumber) {
//                System.out.println("Try lower.");
//            } else {
//                System.out.println("Try higher.");
//            }
//
//        }

/*


Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:

    wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
    sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
    jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
    jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
    jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.


 */