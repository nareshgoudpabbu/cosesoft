import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("     WELCOME TO NUMBER QUEST");
        System.out.println("=================================");

        while (playAgain) {

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == secretNumber) {
                    guessed = true;

                    int roundScore = (maxAttempts - attempts + 1) * 10;
                    totalScore += roundScore;

                    System.out.println("\nCorrect! You guessed the number.");
                    System.out.println("Attempts Used: " + attempts);
                    System.out.println("Round Score: " + roundScore);
                    break;
                } else if (guess > secretNumber) {

                    if (guess - secretNumber <= 5)
                        System.out.println("Too High! But very close.");
                    else
                        System.out.println("Too High!");

                } else {

                    if (secretNumber - guess <= 5)
                        System.out.println("Too Low! But very close.");
                    else
                        System.out.println("Too Low!");
                }

                System.out.println("Attempts Left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.println("\nCurrent Total Score: " + totalScore);

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n=================================");
        System.out.println("Final Score: " + totalScore);
        System.out.println("Thank You For Playing!");
        System.out.println("=================================");

        sc.close();
    }
}
