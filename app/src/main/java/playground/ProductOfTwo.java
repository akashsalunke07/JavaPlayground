
//   Define a method that returns the product of two numbers entered by user.

package playground;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();

        System.out.println("Product is : "+new ProductOfTwo().product(num1,num2));

    }

    public int product(int n1, int n2){
        return n1 * n2;
    }
}
