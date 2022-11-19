package b_First_Java;

import java.util.Scanner;

// Q: Find the Simple Interest
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal, Rate and Time: ");
        float p = in.nextFloat();
        float r= in.nextFloat();
        int t= in.nextInt();

        System.out.println("Simple Interest is: " +(p*r*t)/100);

    }
}
