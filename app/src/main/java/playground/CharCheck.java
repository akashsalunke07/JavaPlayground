
//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

package playground;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("......Enter Your Character......");
        char ch = sc.next().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("......It is Lowercase Character......");
        }
        else if (ch>='A' && ch<='Z'){
            System.out.println("......It is Uppercase Character......");
        }
    }
}
