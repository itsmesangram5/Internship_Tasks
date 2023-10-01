import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int a = 1;    // minRange
        int b = 100; //maxRange
        boolean temp = true;  //playagain
        int attempt = 10; //noOfAttempts You can adjust the number of attempts as needed
        int points = 0;       //

        System.out.println("********************Welcome to Number_Game*********************");
      

        while (temp) {
            int targetNumber = random.nextInt(b - a + 1) + a;
            int z = 0;  //attempts
            
            System.out.println("We have selected a number between " + a + " and " + b + ". Guess the Number ");

            while (z < attempt) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                z++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + z + " attempts.");
                    points++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                if (z == attempt) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            temp = playAgainInput.equals("yes");

            if (temp) {
                System.out.println("Let's play another round!");
            } else {
                System.out.println("Thanks for playing! Your total Points are: " + points);
            }
        }
    }
}
