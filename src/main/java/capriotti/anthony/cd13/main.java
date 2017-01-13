package capriotti.anthony.cd13;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
public class main {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        TooLargeTooSmall t = new TooLargeTooSmall();
        Random random = new Random();
        int secretNumber = random.nextInt(5) + 1;
        System.out.println(t.LargeOrSmall());
    }
}
