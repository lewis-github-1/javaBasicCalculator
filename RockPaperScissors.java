import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {

    public static void main(String[] args) {
        // Creates Scanner object        
        Scanner userChoice = new Scanner(System.in); 

        // Initialize counters
        int wins = 0, losses = 0, ties = 0;
        
        while (true) {
            // Creates random number
            Random rand = new Random();
            int computerNumber = rand.nextInt(3) + 1;

            // Ask for and receive user input
            System.out.println("Choose 1 for Rock, 2 for Paper, 3 for Scissors, or 0 to quit.");
            int choice = userChoice.nextInt();

            // Input validation
            if (choice < 0 || choice > 3) {
                System.out.println("Invalid choice.");
                continue;
            }

            // Ask for 0 to break the loop
            if (choice == 0) {
                System.out.println("Thank you for playing!");
                break;
            }         

            // Rock, Paper, Scissors Logic
            if (choice == computerNumber) {
                System.out.println("Tie. No winner!");
                ties++;
            } else if (choice == 1 && computerNumber == 2) {
                System.out.println("Paper covers rock. You lose!");
                losses++;
            } else if (choice == 1 && computerNumber == 3) {
                System.out.println("Rock bashes scissors. You win!");
                wins++;
            } else if (choice == 2 && computerNumber == 1) {
                System.out.println("Paper covers rock. You win!");
                wins++;
            } else if (choice == 2 && computerNumber == 3) {
                System.out.println("Scissors cut paper. You lose!");
                losses++;
            } else if (choice == 3 && computerNumber == 1) {
                System.out.println("Rock bashes scissors. You lose!");
                losses++;
            } else if (choice == 3 && computerNumber == 2) {
                System.out.println("Scissors cut paper. You win!");
                wins++;
            } 
            System.out.println("Wins: " + wins + " Losses: " + losses + " Ties: " + ties);
                                
        }

        // Closes Scanner
        userChoice.close();


        
    }
}


// Todo list:
// Make the output telling who won clearer
// Add percentages


