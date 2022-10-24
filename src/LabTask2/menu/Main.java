package LabTask2.menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("Welcome");
        System.out.println("Press number according to your food choice for price");
        System.out.println("1: Samosa chat");
        System.out.println("2: Biryani");
        System.out.println("3: Pizza");
        System.out.println("4: Chicken Wings");
        System.out.println("5: Dubai ka pani(Water)");
        System.out.println("==========================================================");
        int order;
        Scanner sc = new Scanner(System.in);
        order = sc.nextInt();

        //Switch expression
        System.out.println("=======================================");
        switch(order){
            //Case statements
            case 1: System.out.println("50RS");
                break;
            case 2: System.out.println("100RS");
                break;
            case 3: System.out.println("300RS");
                break;
            case 4: System.out.println("800RS");
                break;
            case 5: System.out.println("3000RS");
                break;
            //Default case statement
            default:System.out.println("your order number is not correct");
        }
        System.out.println("=======================================");
    }
}
