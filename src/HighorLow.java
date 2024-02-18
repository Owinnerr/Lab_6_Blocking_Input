import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1; // Make the random number variable for user to guess
        int guess = 0; // Initialize guess variable
        String trash = ""; // Initialize trash variable
        boolean done = false; // Initialize done variable and set to false for do while loop
        do {
            System.out.print("Guess my number in a single guess [1-10]: "); // Prompt user for a guess
            if (in.hasNextInt()) { // Condition: If it's safe to read in an int
                guess = in.nextInt(); // Reads an int value from the user
                in.nextLine(); // Clears the newline from the buffer
                if (guess >= 1 && guess <= 10) { // Condition: If guess is greater than or equal to 1 AND less than or equal to 10,
                    done = true; // Set done to true since it is a valid number, and it is in range, and therefore we can end the loop
                } else {
                    System.out.println("You entered your guess as " + guess + ", which is not in the range of 1 to 10."); // Output that the user didn't enter a number in range
                    System.out.println("You have to enter a number in range."); // Output that the user should enter a number in range
                }
            } else {
                trash = in.nextLine(); // Not an int so read the user input as a string
                System.out.println("You entered your guess as " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done); // Loop: While done variable is false (loop will stop when done is true, or in other words once the user enters a valid temp.)
        System.out.println("My random number was " + val); // Output the random number made by the Random class
        if (guess == val) { // Condition: If the guess is equal to the value (the random number)
            System.out.println("Great job! You guessed correctly."); // Output that the user guessed correctly
        } else if (guess > val) { // Condition: If the guess is greater than the value
            System.out.println("Your guess was higher than my number."); // Output that the user guessed too high
        } else {
            System.out.println("Your guess was lower than my number."); // Output that the user guessed too low
        }
    }
}