import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsiusTemperature = 0;
        int fahrenheitTemperature = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter a temperature in celsius: ");
            if (in.hasNextInt()) {
                celsiusTemperature = in.nextInt();
                in.nextLine();
            }
        } while (!done);
    }
}