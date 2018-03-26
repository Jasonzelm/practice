package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class dialouge {
    private static Scanner in = new Scanner(System.in);

    private static linkedList list;

    public static void menu() {

        printMainMenu();
        boolean quit = false;

        do{

            System.out.println("Enter choice: (4 To print the Menu)");
            int opt = in.nextInt();
            in.nextLine();

            switch (opt) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accessAccount();
                    break;
                case 3:
                    printMainMenu();
                    break;
                case 4:
                    quit = true;
                    System.out.print("Goodbye");
                    break;
                case 5:
                    adminMode();
                    break;
            }
        }while(!quit);

    }

    public static void adminMode(){
        int Admin = 24395243;
        System.out.println("Please enter the Admin ID to access Admin options");
        System.out.print("ID:");
        int entered = in.nextInt();

        boolean quit = false;

        if(entered == Admin){
            System.out.println("Welcome ADMIN");
            adminMenu();
            System.out.println("Enter Choice: (5 To print admin menu)");
            int choice = in.nextInt();
            in.nextLine();

            while(!quit){
                switch(choice){
                    case 1:
                        //setPassword();
                        break;
                    case 2:
                        //removeAccount();
                        break;
                    case 3:
                        quit = true;
                        break;
                    case 5:
                        adminMenu();
                        break;
                }
            }

        } else{
            System.out.println("Your admin ID was incorrect");
            printMainMenu();
        }
    }

    private static void adminMenu(){
        System.out.println("1 - To set an account password \n" +
                "2 - To remove an account\n" +
                "3 - To quit admin mode\n");
    }

    public static void createAccount(){
        System.out.print("Make an account number: ");
        int num = in.nextInt();
        int numLength = String.valueOf(num).length();

        while(numLength > 5 || numLength < 5){
            System.out.print("Your account must be 5 digits, Please try again:");
            num = in.nextInt();
            numLength = String.valueOf(num).length();
        }

        if(list.names.contains(num)){
            System.out.println("The Account " + num + ", already exists");
        }else {
            list.names.add(num);
        }

        System.out.println("Ask your ADMIN to set up your password");
        if(list.names.contains(num)) {
            System.out.print("Enter a pin number that is exactly 4 digits:");
            int pin = in.nextInt();
            int pinLength = String.valueOf(pin).length();

            while (pinLength > 4 || pinLength < 4) {
                System.out.println("You did not enter a 4 digit pin, Please try again:");
                pin = in.nextInt();
                pinLength = String.valueOf(pin).length();
            }
        }
    }

    public static void accessAccount(){
        System.out.println("Please enter your account number");
        int num = in.nextInt();
        if(list.names.contains(num)) {
            if(num == list.names.get(0)){
                int pin = 1111;
            }else if(num == list.names.get(1)){
                int pin = 2222;
            }else if(num == list.names.get(2)){
                int pin =3333;;
            }else if(num == list.names.get(3)){
                int pin = 4444;
            }else if(num == list.names.get(4)){
                int pin = 5555;
            }
        }
            System.out.println("Thank you for entering your account info!");
            printAccntMenu();
            boolean quit = false;

            while(!quit){
                System.out.println("Enter choice: (4 To print the Menu)");
                int option = in.nextInt();
                in.nextLine();

                switch(option){
                    case 1:

                }
            }

        else{
            System.out.println("The account name you entered doesnt match any on record");
        }
    }

    public static void printMainMenu(){
        System.out.print("1 - Open a bank account\n" +
                "2 - Access an existing account\n" +
                "3 - Print Menu\n" +
                "4 - Quit Application\n" +
                "5 - Admin\n");
    }

    public static void printAccntMenu(){
        System.out.println("1 - Withdraw\n" +
                "2 - Deposit\n" +
                "3 - Show amount of money in this account\n" +
                "4 - print Menu");
    }

}
