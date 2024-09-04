import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String[] args) {
        double money = acceptInput();
        double numQuarters = money / 0.25;
        double change = money % 0.25;
        double numDimes = change / 0.10;
        change %= 0.10;
        double numNickels = change / 0.05;
        change %= 0.05;
        double numPennies = change / 0.01;
        printOutput(numQuarters, numDimes, numNickels, numPennies);
    }

    public static double acceptInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of money (DO NOT INCLUDE DOLLAR SIGN) : ");
        return input.nextDouble();
    }

    public static void printOutput(double numQuarters, double numDimes, double numNickels, double numPennies) {
        System.out.println((int) numQuarters + " Quarters");
        System.out.println((int) numDimes + " Dimes");
        System.out.println((int) numNickels + " Nickels");
        System.out.println((int) numPennies + " Pennies");
    }
}
