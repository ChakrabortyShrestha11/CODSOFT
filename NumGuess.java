import java.util.*;
 
    public class NumGuess {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound =1;
        int UpperBound = 10;
        int maxAttempt =10;
        int rounds =0;
        int score =0;

        System.out.print("WELCOME! TO THE NUMBER GUESSING GAME");
        System.out.print("YOU WILL GET 10 ATTEMPTS TO GUESS THE NUMBER");
        System.out.print("LET'S START");

        while (true)
        {
            int targetNumber = random.nextInt(UpperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("Round " + (rounds + 1) + ":");
            System.out.println("You have chosen a number between " + lowerBound + " and " + UpperBound + ". Try to guess it!");
             
            while (attempts < maxAttempt) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } 
                else if (userGuess < targetNumber)
                {
                    System.out.println("Your guess is too low. Try again.");
                } 
                else
                {
                    System.out.println("Your guess is too high. Try again.");
                }

                if (attempts == maxAttempt)
                {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = sc.next();

            if (!playAgain.equalsIgnoreCase("yes"))
            {
                System.out.println("Thanks for playing! Your total score is: " + score + " out of " + (rounds + 1) + " rounds won.");
                break;
            }

            rounds++;
        }

        sc.close();
    }
}

         
