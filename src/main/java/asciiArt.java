public class asciiArt {
    public static String findTheMiddle(int number)
    {
        String stringNum = "" + number;
        int mid = stringNum.length()/2;

        if(stringNum.length() % 2 == 1)
        {
            return stringNum.substring(mid,mid+1);
        }
        else
        {
            return stringNum.substring(mid-1,mid+1);
        }
    }


    public static void main(String[] args) {
        System.out.println(" ^^^^^^^^^^^^^^^^");
        System.out.println(" |              |");
        System.out.println("D|    O     O   |D");
        System.out.println(" |              |");
        System.out.println(" |       b      |");
        System.out.println("  \\            /");
        System.out.println("   \\    UU    /");
        System.out.println("    \\________/");


        System.out.println(findTheMiddle(2110890125));


    }

}
