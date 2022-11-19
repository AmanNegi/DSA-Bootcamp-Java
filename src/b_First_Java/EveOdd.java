package b_First_Java;

import java.util.Scanner;

// Q: Check if a number is even or odd
public class EveOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}
