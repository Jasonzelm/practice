//package practice;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
//import java.util.Scanner;
//
//public class dialouge {
//    private static Scanner in = new Scanner(System.in);
//
//    private static linkedList list;
//
//    public static void menu() {
//
//        printMainMenu();
//        boolean quit = false;
//
//        do{
//
//            System.out.println("Enter choice: (4 To print the Menu)");
//            int opt = in.nextInt();
//            in.nextLine();
//
//            switch (opt) {
//                case 1:
//                    createAccount();
//                    break;
//                case 2:
//                    accessAccount();
//                    break;
//                case 3:
//                    printMainMenu();
//                    break;
//                case 4:
//                    quit = true;
//                    System.out.print("Goodbye");
//                    break;
//                case 5:
//                    adminMode();
//                    break;
//            }
//        }while(!quit);
//
//    }
//
//    public static void adminMode(){
//        int Admin = 24395243;
//        System.out.println("Please enter the Admin ID to access Admin options");
//        System.out.print("ID:");
//        int entered = in.nextInt();
//
//        boolean quit = false;
//
//        if(entered == Admin){
//            adminMenu();
//            System.out.print("Enter Choice(5 To print admin menu)");
//            int choice = in.nextInt();
//            in.nextLine();
//
//            while(!quit){
//                switch(choice){
//                    case 1:
//
//                }
//            }
//
//        }
//    }
//
//    private static void adminMenu(){
//        System.out.println("1 - To see all accounts\n" +
//                "2 - To add an Account\n" +
//                "3 - To remove an account\n" +
//                "4 - To quit admin mode\n");
//    }
//
//    public static void createAccount(){
//        System.out.println("Enter an account number less than 4 digits: ");
//        int num = in.nextInt();
//        list.addInOrder(name);
//
//        if(list.names.contains(name)){
//            System.out.println(name + ", was added successfully\n");
//        }
//    }
//
//    public static void accessAccount(){
//        System.out.println("Please enter your account name");
//        String name = in.nextLine();
//        if(list.names.contains(name)){
//            System.out.println("Thank you for entering your account info!");
//            printAccntMenu();
//            boolean quit = false;
//
//            while(!quit){
//                System.out.println("Enter choice: (4 To print the Menu)");
//                int option = in.nextInt();
//                in.nextLine();
//
//                switch(option){
//                    case 1:
//
//                }
//            }
//
//        }else{
//            System.out.println("The account name you entered doesnt match any on record");
//        }
//    }
//
//    public static void printMainMenu(){
//        System.out.print("1 - Open a bank account\n" +
//                "2 - Access an existing account\n" +
//                "3 - Print Menu\n" +
//                "4 - Quit Application\n" +
//                "5 - Admin\n");
//    }
//
//    public static void printAccntMenu(){
//        System.out.println("1 - Withdraw\n" +
//                "2 - Deposit\n" +
//                "3 - Show amount of money in this account\n" +
//                "4 - print Menu");
//    }
//
//}