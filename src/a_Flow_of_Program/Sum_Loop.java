package a_Flow_of_Program;

import java.util.Scanner;

// Q: Input numbers till x/X is entered and print the sum of numbers
public class Sum_Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            String input = in.next();
            char check= input.charAt(0);
            if(check== 'x'|| check== 'X'){
                break;
            }

            ans += Integer.parseInt(input);
        }
        System.out.println("Sum: "+ ans);
    }
}
