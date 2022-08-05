//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".


package playground;

import java.util.Scanner;

public class FirstAndLastOccur {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = "Hello, World";
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        System.out.println("First index of "+ch+" is "+word.indexOf(ch));
        System.out.println("Last index of "+ch+" is "+word.lastIndexOf(ch));


    }
}
