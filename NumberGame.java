import  java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(200) + 1;
        int attempts = 0;
        int guess;

        System.out.println("=etween 1 and 200");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High!");
            } 
            else if (guess < number) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("Correct!");
                System.out.println("You guessed the number in "
                        + attempts + " attempts.");
            }

        } while (guess != number);

        sc.close();
    }
}