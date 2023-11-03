import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Can i know your name ?");
        String name = scanner.nextLine();
        System.out.println("OK, " + name + ", I am thinking of a number between 1 and 100!");
            Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("choose no of attempts!");
            // Scanner sc = new Scanner(System.in);
            int maxAttempts = scanner.nextInt();
            

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);
        System.out.println("Thank You, " + name + ", for playing with us.");

        scanner.close();
    }
}