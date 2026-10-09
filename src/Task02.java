import java.util.Scanner;

public class Task02 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        double gallons;
        double mpg;
        double price;

        do {
            System.out.print("Enter the number gallons in your tank: ");
            gallons = sc.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency of your car: ");
            mpg = sc.nextDouble();
        } while (mpg <= 0);
        do {
            System.out.print("Enter the price per gallon: ");
            price = sc.nextDouble();
        } while (price <= 0);

        double costFor100Miles = (100 / mpg) * price;
        double distanceWithFullTank = gallons * mpg;
        double roundedFor100Miles = Math.round(costFor100Miles * 100.0) / 100.0;

        System.out.println("The cost to drive 100 miles is: " + roundedFor100Miles);
        System.out.print("The farthest you can go with a full tank is: " + distanceWithFullTank);
    }
}
