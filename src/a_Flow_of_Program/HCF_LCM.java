package a_Flow_of_Program;

import java.util.Scanner;

// Q: Input two numbers and print their HCF and LCM.
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // 1. Find LCM
        // LCM will be the smallest number divisible by both numbers

        int min = (a < b) ? a : b;
        for (int i = min; true; i++) {

            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM is: " + i);
                break;
            }
        }

        // 2. Find HCF
        // HCF will be the highest factor dividing both numbers

        int max = (a > b) ? a : b;
        int sqrt = (int) Math.sqrt(max);

        int hcf = 1;
        for (int i = min; i != sqrt; i--) {
            if (a % i == 0 && b % i == 0) {
               hcf = i;
                break;
            }
        }
        System.out.println("HCF is: " + hcf);
    }
}
