package b_First_Java;

import java.net.URLConnection;
import java.util.Scanner;

// Q: Take 2 numbers as input and print the largest.
public class LargestTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a>b?"A is greater":"B is greater");

    }

}
