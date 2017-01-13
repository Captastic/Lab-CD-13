package capriotti.anthony.cd13;

/**
 * Created by anthonycapriotti on 1/12/17.
 */
import java.util.Random;
import java.util.Scanner;


public class TooLargeTooSmall {
    int secretNumber =3 ;
    int n;

    public String LargeOrSmall() {
        Scanner ask = new Scanner(System.in);
        int attempts = 0;
        int prev = 0;
        System.out.println("Pick a number");
        n = ask.nextInt();
        while (n != secretNumber) {
            if (n > secretNumber) {
                System.out.println("Too high, guess again");

            } else {
                System.out.println("Too low, guess again");
            }

            if (n != prev) {
                attempts++;
            }

            System.out.println("You've guessed " + attempts + " times");
            prev = n;
            n = ask.nextInt();
        }

        System.out.println("Good jorb");
        return "You've guessed " + (attempts + 1) + " times";

    }
}

