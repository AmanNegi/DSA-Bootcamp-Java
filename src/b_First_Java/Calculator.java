package b_First_Java;

import java.util.Scanner;

// Q: Take in two numbers and an operator (+, -, *, /) and calculate the value.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your operator: ");
        char operator = scanner.next().trim().charAt(0);

        if(operator == '/'|| operator == '+'|| operator == '-'||operator=='*'||operator=='%'){
            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            double res = 0;
            switch(operator){
                case '+':{
                    res = a+b;
                    break;
                } case '-':{
                   res  = a-b;
                   break;
                } case '*':{
                    res = a*b;
                    break;
                } case '/':{
                    res = a/b;
                    break;
                }
                case '%':{
                    res = a%b;
                    break;
                }
            }
            System.out.println("Result: "+res);
        }else{
            System.out.println("Enter a valid operator");
        }
    }
}
