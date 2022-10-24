package LabTask2.calculator;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int x;
            int y;
            String op;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of X");
            x = sc.nextInt();
            System.out.println("Enter your operation (+,-,*,/)");
            op = sc.next();
            System.out.println("Enter value of Y");
            y = sc.nextInt();
            switch(op){
                case "+" : System.out.println(x+y);
                    break;
                case "-" : System.out.println(x-y);
                    break;
                case "*" : System.out.println(x*y);
                    break;
                case "/" : System.out.println(x/y);
                    break;
                default:System.out.println("your value is not correct");
            }
        }
}
