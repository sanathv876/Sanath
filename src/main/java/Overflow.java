public class Overflow {
    public static void main(String[] args) {
        double x = 10.5;
        final double y = .5;
        int z = (int) (x+y);
        //System.out.print(z);
        int a = (int) x;

        int grade1=10;
        int grade2=20;
        int grade3=35;

        double avg = (double) (grade1 + grade2 + grade3)/3;
        System.out.print(avg);


    }

}
