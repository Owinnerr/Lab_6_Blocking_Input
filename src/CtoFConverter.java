import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsiusTemperature = 0; // Initialize celsius variable (for user input)
        double fahrenheitTemperature = 0; // Initialize fahrenheit variable (conversion)
        String trash = ""; // Initialize trash variable (bad user input)
        boolean done = false; // Initialize done variable and set to false for do while loop
        do {
            System.out.print("Enter a temperature in celsius: "); // Prompt user for temperature in celsius
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                celsiusTemperature = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the temperature was " + trash + ", which is not a valid temperature."); // Output that the user input is not a valid temperature
                System.out.println("You have to enter a valid temperature."); // Output that the user should enter a valid temperature
            }
        } while(!done); // Loop: While done variable is false (loop will stop when done is true, or in other words once the user enters a valid temp.)
        fahrenheitTemperature = 1.8 * (celsiusTemperature) + 32; // Set the fahrenheitTemperature variable to the celsius to fahrenheit equation
        System.out.println("The temperature in fahrenheit is " + fahrenheitTemperature); // Output the temperature in fahrenheit
    }
}