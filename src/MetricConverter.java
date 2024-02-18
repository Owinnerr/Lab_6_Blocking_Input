import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meterMeasurement = 0; // Initialize meter measurement variable
        double milesMeasurement = 0; // Initialize miles measurement variable
        double feetMeasurement = 0; // Initialize feet measurement variable
        double inchesMeasurement = 0; // Initialize inches measurement variable
        String trash = ""; // Initialize trash variable
        boolean done = false; // Initialize done variable and set to false for do while loop
        do {
            System.out.print("Enter a measurement in meters: "); // Prompt user for measurement in meters
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                meterMeasurement = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the measurement was " + trash + ", which is not a valid measurement number."); // Output that the user input is not a valid measurement number
                System.out.println("You have to enter a valid measurement number."); // Output that the user should enter a valid measurement number
            }
        } while(!done); // Loop: While done variable is false (loop will stop when done is true, or in other words once the user enters a valid measurement number)
        milesMeasurement = meterMeasurement / 1609.34; // Set the milesMeasurement variable to the meters to miles conversion
        System.out.println("The measurement in miles is " + milesMeasurement); // Output the measurement in miles
        feetMeasurement = meterMeasurement * 3.281; // Set the feetMeasurement variable to the meters to feet conversion
        System.out.println("The measurement in feet is " + feetMeasurement); // Output the measurement in feet
        inchesMeasurement = meterMeasurement * 39.37; // Set the inchesMeasurement variable to the meters to inches conversion
        System.out.println("The measurement in inches is " + inchesMeasurement); // Output the measurement in inches
    }
}