package b_First_Java;

import java.util.Scanner;

// Q: Check if given String is Palindrome or not
public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.next();
        String rev = "";

        for (int i = text.length()-1 ; i >=0; i--) {
            rev = rev.concat(String.valueOf(text.charAt(i)));
        }
        System.out.println(rev.equals(text) ? "Is Palindrome" : "Is not Palindrome");
    }
}
