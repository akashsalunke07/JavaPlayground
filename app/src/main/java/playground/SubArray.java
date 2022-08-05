/*
If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
your program should be able to find that the subarray lies between the indexes 3 and 8.

 */


package playground;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

        int[] subArray = Arrays.copyOfRange(arr , 3,8);

        for (int i = 0; i<subArray.length;i++){
            System.out.print(subArray[i]+"  ");
        }

    }
}
