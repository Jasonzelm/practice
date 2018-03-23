package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Account {

    private static Scanner in = new Scanner(System.in);

    public Account(int accntNum, String accntPin){

    }

    public static void setAccount(){
        System.out.print("Enter account number:");
        int accnt = in.nextInt();
        in.nextLine();
        int accntlength = String.valueOf(accnt).length();
        while(accntlength > 4 || accntlength < 4){
            System.out.print("Your account number was'nt 4 digits please try again:");
            accnt = in.nextInt();
            accntlength = String.valueOf(accnt).length();
        }

        System.out.print("Enter account Pin:");
        String pin = in.nextLine();
        while(pin.length() < 6 || pin.length() >14){
            System.out.print("Your password must be at least 6 characters and less than 14 characters, Please try again:");
            pin = in.nextLine();
        }

        Account newAccnt = new Account(accnt, pin);
        //make it correspond to a certain account that has control over only its balance
    }
}
