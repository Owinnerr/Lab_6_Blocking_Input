import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numberOfGallons = 0; // Initialize number of gallons variable
        double fuelEfficiency = 0; // Initialize fuel efficiency variable
        double priceOfGas = 0; // Initialize price of gas variable
        double costPerHundredMiles = 0; // Initialize cost per hundred miles variable
        double carRangeWithGas = 0; // Initialize car range variable
        String trash = ""; // Initialize trash variable
        boolean done1 = false; // Initialize done1 variable (initially set as false for while loop)
        boolean done2 = false; // Initialize done2 variable (initially set as false for while loop)
        boolean done3 = false; // Initialize done3 variable (initially set as false for while loop)
        do {
            System.out.print("Enter the number of gallons of gas in the tank: "); // Prompt the user for the number of gallons of gas
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                numberOfGallons = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done1 = true; // Set done1 to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the number of gallons was " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done1); // Loop: While done1 variable is false (loop will stop when done1 is true, or in other words once the user enters a valid number)
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: "); // Prompt the user for the fuel efficiency
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                fuelEfficiency = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done2 = true; // Set done2 to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the fuel efficiency was " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done2); // Loop: While done2 variable is false (loop will stop when done2 is true, or in other words once the user enters a valid number)
        do {
            System.out.print("Enter the price of gas per gallon: "); // Prompt the user for the price of gas
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                priceOfGas = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done3 = true; // Set done3 to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the price of gas per gallon " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done3); // Loop: While done3 variable is false (loop will stop when done3 is true, or in other words once the user enters a valid number)
        costPerHundredMiles = (priceOfGas / fuelEfficiency) * 100; // Set the costPerHundredMiles variable to the price of gas divided by fuel efficiency multiplied by 100
        System.out.println("The cost per 100 miles is $" + costPerHundredMiles); // Output the cost per 100 miles
        carRangeWithGas = numberOfGallons * fuelEfficiency; // Set the carRangeWithGas variable to number of gallons multiplied by fuel efficiency
        System.out.println("The amount of miles the car can go with the gas in the tank is " + carRangeWithGas); // Output the car range using the gas in the tank
    }
}