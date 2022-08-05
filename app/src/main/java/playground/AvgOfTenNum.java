package playground;

import java.util.Scanner;

public class AvgOfTenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double avg = sum / 10;
        System.out.println(avg);
    }
}
