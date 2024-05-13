package ds.linkedlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<100000; i++){
            linkedList.add(i);
        }
        for(int i=0; i<100000; i++){
            arrayList.add(i);
        }
        Iterator<Integer> it1 = linkedList.iterator();
        Iterator<Integer> it2 = arrayList.iterator();


        System.out.println(new Date());
        while (it1.hasNext()){
            it1.next();
        }
        System.out.println(new Date());
        while (it2.hasNext()){
            it2.next();
        }
        System.out.println(new Date());
        for(int i=0; i<100000; i++){
            linkedList.get(i);
        }
        System.out.println(new Date());
        for(int i=0; i<100000; i++){
            arrayList.get(i);
        }
        System.out.println(new Date());


    }
}
