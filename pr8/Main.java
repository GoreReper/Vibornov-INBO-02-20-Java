package pr8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        c.add(12);
        c.add(54);
        c.add(366);
        WaitList<Integer> waitList = new WaitList<Integer>();
        int a=44;
        if (waitList.isEmpty()){
            System.out.println("Wait List is empty");
        }
        else {
            System.out.println("Wait List isn't empty");
        }
        waitList.add(54);
        waitList.add(12);
        waitList.add(a);
        waitList.add(366);
        if (waitList.containsAll(c)){
            System.out.println("Wait List contains collection:"+c.toString());
        }
        else {
            System.out.println("Wait List doesn't contain collection:"+c.toString());
        }
        if (waitList.contains(a)){
            System.out.println("Wait List contains:"+a);
        }
        else {
            System.out.println("Wait List doesn't contain:"+a);
        }
        if (waitList.isEmpty()){
            System.out.println("Wait List is empty");
        }
        else {
            System.out.println("Wait List isn't empty");
        }
        waitList.remove();
        System.out.println(waitList.toString());
        if (waitList.containsAll(c)){
            System.out.println("Wait List contains collection:"+c.toString());
        }
        else {
            System.out.println("Wait List doesn't contain collection:"+c.toString());
        }
        int capacity=5;
        BoundedWaitList<Integer> bwl=new BoundedWaitList<Integer>(capacity);
        bwl.add(5);
        bwl.add(5);
        bwl.add(5);
        bwl.add(5);
        bwl.add(5);
        bwl.add(5);
        System.out.println(bwl.toString());
        UnfairWaitList<Integer> uwl=new UnfairWaitList<Integer>();
        uwl.add(12);
        uwl.add(23);
        uwl.add(34);
        System.out.println(uwl.toString());
        uwl.remove(23);
        System.out.println(uwl.toString());
        uwl.moveToBack(12);
        System.out.println(uwl.toString());
    }
}
