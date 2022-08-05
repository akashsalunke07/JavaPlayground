
//   A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//   Ask user for their salary and year of service and print the net bonus amount.
package playground;

import java.util.Scanner;

public class CompanyBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.println("Enter your years of service : ");
        int serviceYears = sc.nextInt();
        double bonus = 0;

        if(serviceYears>5){
            bonus = salary * 0.05 ;
        }

        System.out.println("Your Bonus is :"+bonus);

    }

}
