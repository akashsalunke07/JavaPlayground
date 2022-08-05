//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
package playground;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        GCD_HCF obj = new GCD_HCF();
        int hcf = obj.gcd(number1,number2);

        System.out.println("Greatest common divisor (GCD) or highest common factor (HCF) of given two numbers is "+hcf);

    }
    public int gcd(int num1, int num2){
        int gcd = num1<num2 ? num1 : num2;
        while(gcd>0){
            if(num1%gcd==0 && num2%gcd==0){
                break;
            }
            gcd--;
        }
        return gcd;
    }


}
