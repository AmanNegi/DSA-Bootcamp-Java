package b_First_Java;

import java.util.Scanner;

// Q: To calculate Fib Series up to 'n' numbers
public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b += a;
            a = temp;
        }

        System.out.println(b);
    }
}
