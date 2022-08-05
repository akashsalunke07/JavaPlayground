//Take two int values from the user and print the greatest among them.
package playground;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = num1>num2?num1:num2;

        System.out.println("Larges number is "+ max);


    }
}
