public class SayHello
{
    public static void run()
    {
        String stringArray[] = {"h", "e", "l", "l", "o", "w"};
        for(int i=0; i <= stringArray.length; i++)
        {
            System.out.print(stringArray[i]);
        }
    }
    public static void mystery()
    {
        int[] arr = {-17,  -14,  3,  9,  21,  34};
        for (int i = 0; i < arr.length / 2; i += 2)
        {
            arr[i] = arr[i]  *  2;

        }
        for(int i : arr){
            System.out.print(i +" ");
        }


    }
    public static void for1(){
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] += 5;
        }
        for(int j : numbers){
            System.out.print(j + " ");
        }
    }
    public static void for2(){
        int[] numbers = {1, 2, 3, 4};
        for (int number : numbers)
        {
            number += 5;
        }
        for(int k : numbers){
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args){
        //run();
        //mystery();
        for1();
        System.out.println();
        for2();
    }
}
