package a_Flow_of_Program;

import java.util.Scanner;

// Q: Input a number and print the multiplication table for it.
public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i =1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
