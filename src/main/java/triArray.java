import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triArray {
    public static int search(ArrayList<Integer> list, int target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        int currentMinIndex;
        int counter = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(currentMinIndex)) {
                    currentMinIndex = j;
                }
            }
            if (i != currentMinIndex) {
                int temp = arr.get(currentMinIndex);
                arr.set(currentMinIndex, arr.get(i));
                arr.set(i, temp); //Line 19
                counter++;
            }
        }
        return arr;
    }
    public static int[] insertionSort(int[] arr)
    {
        int count =0;
        for (int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];

            int curIndex = i-1;

            while ( curIndex >= 0 && arr[curIndex] > curNumber)
            {
                arr[curIndex+1] = arr[curIndex];
                curIndex--; //Line 13
                count++;
            }
            arr[curIndex + 1] = curNumber;
        }
        System.out.println(count);
        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        int counter = 0;
        while(counter < list.size())
        {
            counter++;
            list.set(counter, list.get(counter)+5);
        }
        System.out.println(list.toString());






    }

}

