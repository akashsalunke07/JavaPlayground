
//Write a program to check if the letter 'e' is present in the word 'Umbrella'.

package playground;

import java.util.Scanner;

public class LetterContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = "Umbrella";

        System.out.println("Enter the Character want to check : ");
        char ch = sc.next().charAt(0);

        if(word.indexOf(ch)>=0){
            System.out.println("Word "+word+" contains letter letter "+ch);
        }
        else {
            System.out.println("Word "+word+" does not contains letter letter "+ch);
        }

    }
}
