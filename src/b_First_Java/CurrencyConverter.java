package b_First_Java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ₹");
        long amount = in.nextLong();

        // As of 19/11/2022 rupee prices to 0.012~ Dollar
        System.out.println("Amount in Dollar: $"+ (float)(amount* 0.012));
    }
}
