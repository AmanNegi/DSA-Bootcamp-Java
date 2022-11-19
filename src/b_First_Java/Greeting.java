package b_First_Java;

import java.util.Scanner;

// Q: Take name as an input and greet Hello, Name
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println("Hello, " + name);

    }
}
