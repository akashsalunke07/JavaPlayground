package playground;

import org.checkerframework.checker.units.qual.A;

import java.util.Scanner;

public class ArraySumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of an array");
        int a[] = new int[size];
        for (int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        ArraySumAndProduct obj = new ArraySumAndProduct();

        System.out.println("Sum of the elements of array is : "+obj.sumOfArray(a));
        System.out.println("Product of the elements of array is : "+obj.productOfArray(a));

    }

    public int sumOfArray(int[] arr){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public int productOfArray(int[] arr){
        int product = 1;
        for (int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        return product;
    }

}
