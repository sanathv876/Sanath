import java.util.Scanner;

public class Counter {
    int choice;
    int numIn;
    int numOut;
    public Counter(int theChoice){
        choice = theChoice;
    }
    public void addPerson(){
        numIn++;
    }
    public void removePerson(){
        numOut++;
    }
    public int getIn(){
        return numIn;
    }

    public int getOut(){
        return numOut;
    }

    public int currentInside(){
        return numIn - numOut;
    }





    public static void main(String[] args) {
        boolean toLoop = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to go in");
        System.out.println("Enter 2 to go out");
        System.out.println("Enter 3 to get total number of people inside");
        System.out.println("Enter 4 to get total number of people outside");
        System.out.println("Enter 5 to get number of people inside");
        System.out.println("Enter 6 to exit");
        System.out.print("Enter Choice : ");
        int choice = input.nextInt();
        Counter counter = new Counter(choice);
        if (choice == 1) {
            counter.addPerson();
        } else if (choice == 2) {
            counter.removePerson();
        } else if (choice == 3) {
            System.out.println("Number of people that went inside " + counter.getIn());
        } else if (choice == 4) {
            System.out.println("Number of people that went outside " + counter.getOut());
        } else if (choice == 5) {
            System.out.println("Number of people currently inside " + counter.currentInside());

        } else if (choice == 6) {
            System.out.print("Break");
            toLoop = false;
        }
        while (choice != 6) {
            System.out.println("Enter 1 to go in");
            System.out.println("Enter 2 to go out");
            System.out.println("Enter 3 to get totalIn");
            System.out.println("Enter 4 to get totalOut");
            System.out.println("Enter 5 to get number of people inside");
            System.out.println("Enter 6 to exit");
            System.out.print("Enter Choice : ");
            choice = input.nextInt();

            if (choice == 1) {
                counter.addPerson();
            } else if (choice == 2) {
                counter.removePerson();
            } else if (choice == 3) {
                System.out.println("***********************************");
                System.out.println("Number of people that went inside " + counter.getIn());
                System.out.println("***********************************");
            } else if (choice == 4) {
                System.out.println("Number of people that went outside " + counter.getOut());
            } else if (choice == 5) {
                System.out.println("Number of people currently inside " + counter.currentInside());

            }


        }
    }
}