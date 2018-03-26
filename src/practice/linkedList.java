package practice;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
    public static LinkedList<Integer> names = new LinkedList<>();
    public static Iterator<Integer> i = names.iterator();
    private static int accntNum;
    private static int pin;



    public static int getAccntNum() {
        return accntNum;
    }

    public static int getPin() {
        return pin;
    }

}
