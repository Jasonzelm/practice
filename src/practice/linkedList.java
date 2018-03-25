package practice;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {
    public static LinkedList<linkedList> names = new LinkedList<>();
    public static ListIterator<linkedList> listIterator = names.listIterator();
    private static int accntNum;
    private static int pin;

    public linkedList(int accntNum, int pin){
        this.accntNum = accntNum;
        this.pin = pin;
    }

    public static int getAccntNum() {
        return accntNum;
    }

    public static int getPin() {
        return pin;
    }

//    public static void addInOrder(linkedList toAdd) {
//
//        while (listIterator.hasNext()) {
//            boolean comparison = listIterator.next().equals(toAdd);
//            if (comparison == true) {
//                System.out.println(toAdd + ", is already an account");
//            } else {
//                names.add(toAdd);
//            }
//        }
//    }

    public static void printNames(){
        int i=0;
        while(i<names.size()){
            System.out.println(linkedList.getAccntNum());
        }
    }
}
