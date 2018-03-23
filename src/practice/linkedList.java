//package practice;
//
//import sun.awt.image.ImageWatched;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//public class linkedList {
//    private static Account accnt;
//    public static LinkedList<accnt> names = new LinkedList<String>();
//
//    public static boolean addInOrder(String toAdd){
//        ListIterator<String> listIterator = names.listIterator();
//
//        while(listIterator.hasNext()){
//            int comparison = listIterator.next().compareTo(toAdd);
//
//            if(comparison == 0){
//                System.out.println(toAdd + " is already a registered name");
//                return false;
//            }
//            else if(comparison > 0){
//                //add TOADD before this string
//                listIterator.previous();
//                listIterator.add(toAdd);
//                return true;
//            }else if(comparison < 0){
//                //do nothing everything is in order
//            }
//        }
//        listIterator.add(toAdd);
//        return true;
//    }
//
//    public static void printNames(LinkedList<String> list){
//        Iterator<String> i = list.listIterator();
//        while(i.hasNext()){
//            System.out.println("now looking into " + i.next());
//        }
//        System.out.println("==========================================");
//    }
//}
