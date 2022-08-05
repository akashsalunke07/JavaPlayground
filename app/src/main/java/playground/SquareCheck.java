//Take values of length and breadth of a rectangle from the user and check if it is square or not.
package playground;

import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        boolean ifSquare = length==breadth ? true : false ;

        if(ifSquare)
            System.out.println("It is a Square");
        else
            System.out.println("It is not a Square");

    }
}
