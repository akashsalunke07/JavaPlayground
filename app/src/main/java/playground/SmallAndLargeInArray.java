//Find largest and smallest elements of an array.

package playground;

import java.util.Scanner;

public class SmallAndLargeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of an array");
        int a[] = new int[size];
        for (int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        SmallAndLargeInArray obj = new SmallAndLargeInArray();

        System.out.println("Largest no in Array is : "+obj.largestInArray(a));
        System.out.println("Smallest no in Array is : "+obj.smallestInArray(a));
    }

    public int smallestInArray(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public int largestInArray(int[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
