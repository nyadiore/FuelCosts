import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        // Get the number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (gallons < 0);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        } while (fuelEfficiency <= 0);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (pricePerGallon < 0);

        // Calculate the cost to drive 100 miles
        double costToDrive100Miles = (100 / fuelEfficiency) * pricePerGallon;

        // Calculate how far the car can go with a full tank
        double distanceWithFullTank = gallons * fuelEfficiency;

        // Print the results
        System.out.println("The cost to drive 100 miles is: " + costToDrive100Miles);
        System.out.println("The car can go" + distanceWithFullTank + "miles with a full tank of gas");

    }
}
