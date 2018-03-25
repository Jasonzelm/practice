package practice;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {
    public static LinkedList<linkedList> names = new LinkedList<>();

    public linkedList(int AccntNum, int pin){
        
    }

    public static void addInOrder(linkedList toAdd) {
        ListIterator<linkedList> listIterator = names.listIterator();

        while (listIterator.hasNext()) {
            boolean comparison = listIterator.next().equals(toAdd);
            if (comparison == true) {
                System.out.println(toAdd + ", is already an account");
            } else {
                names.add(toAdd);
            }
        }
    }

    public static void printNames(){
        Iterator<linkedList> i = names.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
