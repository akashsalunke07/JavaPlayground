
/*  A shop will give a discount of 10% if the cost of the purchased quantity is more than 1000.
    Ask the user for quantity
    Suppose, one unit will cost 100.
    Judge and print total cost for the user.
*/

package playground;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity : ");
        int quantity = sc.nextInt();
        double totalCost = (quantity * 100) ;

        if(totalCost>1000){
            totalCost -= ((quantity * 100) * 0.1) ;
        }



        System.out.println("Total Cost of "+quantity+" items is "+totalCost);


    }
}
