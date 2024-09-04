import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your desired number of gallons and we will convert to liters! : ");
        double gallons = input.nextDouble();
        double liters = gallons * 3.78;
        System.out.print(gallons + " gallons is ");
        System.out.println(liters + " liters!");
    }
}
