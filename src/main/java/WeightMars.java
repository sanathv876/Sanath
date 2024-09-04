import java.util.Scanner;

public class WeightMars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight on Earth (in pounds) and we will calculate your weight on Mars! : ");
        double earthWeight = input.nextDouble();

        double marsWeight = earthWeight * 0.37;

        System.out.println("You are " + marsWeight + " pounds on Mars");


    }
}
