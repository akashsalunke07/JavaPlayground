package playground;

import java.util.Scanner;

public class MaxCheck3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = sc.nextInt();


        MaxCheck3 m3 = new MaxCheck3();

        System.out.println("Largest number is : ");
        System.out.println(m3.largestAmongThree(num1,num2,num3));
        System.out.println("Smallest number is : ");
        System.out.println(m3.smallestAmongThree(num1,num2,num3));

    }

    public int largestAmongThree(int num1, int num2, int num3){
        int max = num1>num2?( num1 >num3 ? num1:num3  ) : ( num2>num3 ? num2:num3 ) ;
        return max;
    }

    public int smallestAmongThree(int num1, int num2, int num3){
        int min = num1<num2?( num1 <num3 ? num1:num3  ) : ( num2<num3 ? num2:num3 ) ;
        return min;
    }
}
