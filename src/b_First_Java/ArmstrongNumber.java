package b_First_Java;

import java.util.Scanner;

// Q: Check if a number is an Armstrong number
// A number where the sum of cube of digits is equal to the number
// eg: 153 => (1*1*1)+(5*5*5)+(3*3*3)

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int n = Integer.parseInt(num);

        int x = 0;
        for (int i = 0; i < num.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(num.charAt(i)));
            x += temp * temp * temp;
        }
        System.out.println(x == n ? "Armstrong Number" : "Normal Number");
    }
}
