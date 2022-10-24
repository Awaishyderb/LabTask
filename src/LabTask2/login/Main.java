package LabTask2.login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] st = new String[5][2];

//        Accounts
        st[0][0] = "Awais";
        st[0][1] = "Hacker";
        st[1][0] = "Hyder";
        st[1][1] = "Ali";
        st[2][0] = "MAli";
        st[2][1] = "343";
        st[3][0] = "KhanAli";
        st[3][1] = "56";
        st[4][0] = "KhanAli";
        st[4][1] = "56";


//        Input
        System.out.println("Enter your Username");
        String username = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();


        if (st[0][0].equals(username) && st[0][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[1][0].equals(username) && st[1][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[1][1].equals(username) && st[1][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[2][0].equals(username) && st[2][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[2][1].equals(username) && st[2][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[3][0].equals(username) && st[3][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[3][1].equals(username) && st[3][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[4][0].equals(username) && st[4][1].equals(password)) {
            System.out.println("Welcome");
        }
        else if (st[4][1].equals(username) && st[4][1].equals(password)) {
            System.out.println("Welcome");
        }else {
            System.out.println("Invalid Username or Password");
        }


    }
}

