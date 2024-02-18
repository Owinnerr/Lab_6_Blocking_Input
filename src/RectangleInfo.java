import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0; // Initialize width variable
        double height = 0; // Initialize height variable
        double area = 0;
        double perimeter = 0;
        double lengthOfDiagonal = 0;
        String trash = ""; // Initialize trash variable
        boolean done1 = false; // Initialize done1 variable and set to false for do while loop
        boolean done2 = false; // Initialize done2 variable and set to false for do while loop
        do {
            System.out.print("Enter the width: "); // Prompt user for width of rectangle
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                width = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done1 = true; // Set done to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the temperature was " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done1); // Loop: While done1 variable is false (loop will stop when done1 is true, or in other words once the user enters a valid number)
        do {
            System.out.print("Enter the height: "); // Prompt user for height of rectangle
            if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                height = in.nextDouble(); // Reads a double value from the user
                in.nextLine(); // Clears the newline from the buffer
                done2 = true; // Set done2 to true since it is a valid number, and therefore we can end the loop
            } else {
                trash = in.nextLine(); // Not a double so read the user input as a string
                System.out.println("You said the temperature was " + trash + ", which is not a valid number."); // Output that the user input is not a valid number
                System.out.println("You have to enter a valid number."); // Output that the user should enter a valid number
            }
        } while(!done2); // Loop: While done2 variable is false (loop will stop when done2 is true, or in other words once the user enters a valid number)
        area = width * height; // Set the area variable to the width multiplied by the height
        System.out.println("The area of the rectangle is " + area); // Output the area of the rectangle
        perimeter = 2 * (width + height); // Set the perimeter variable to 2 multiplied by the width plus the height
        System.out.println("The perimeter of the rectangle is " + perimeter); // Output the perimeter of the rectangle
        lengthOfDiagonal = Math.sqrt(Math.pow(width,2) + Math.pow(height,2)); // Set the lengthOfDiagonal variable to square root of the width squared plus the height squared (all using the Math class)
        System.out.println("The length of the diagonal of the rectangle is " + lengthOfDiagonal); // Output the length of the diagonal of the rectangle
    }
}