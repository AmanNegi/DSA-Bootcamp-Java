package a_Flow_of_Program;

import java.util.Scanner;

// Q: Input a year and check if it's a leap year or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year%4==0) System.out.println("Leap Year");
        else System.out.println("Normal Year");
    }
}
