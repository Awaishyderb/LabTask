package LabTask2.fibonacci;

// 2k22/CSE/29
// Awais Hyder

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fib(num));
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
}
