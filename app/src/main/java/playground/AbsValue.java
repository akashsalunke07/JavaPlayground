//  Write a program to print absolute value of a number entered by user. E.g.-
//  INPUT: 1        OUTPUT: 1
//  INPUT: -1        OUTPUT: 1
//
package playground;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Value ; ");
        int value = sc.nextInt();
        int res = Math.abs(value);
        System.out.println(res);
    }
}
