package com.javaLectureEightHW.nikolay;

import java.util.LinkedList;
import java.util.List;

public class CollectionsRunner {

    public static void main(String[] args) {

        MyArrayList array1 = new MyArrayList();

        array1.add(4);
        array1.printArray();
        System.out.println();

        array1.randomArray();
        array1.printArray();
        System.out.println();
        array1.add(11);
        array1.printArray();

        array1.remove(7);
        System.out.println();
        array1.printArray();
        System.out.println();

        MyLinkedList linlist = new MyLinkedList();
        linlist.addLastNode(5);
        linlist.printListMy();
        linlist.addLastNode(88);
        linlist.printListMy();
        linlist.addLastNode(7);
        linlist.printListMy();
        linlist.addFirstNode(99);
        linlist.printListMy();

        MyLinkedList<String> linkedStrings = new MyLinkedList<String>();
        linkedStrings.addLastNode("first string");
        linkedStrings.addLastNode("second");
        linkedStrings.addLastNode("third");
        linkedStrings.printListMy();
        linkedStrings.addFirstNode("very first string");
        linkedStrings.printListMy();

        System.out.println(linkedStrings.getSize());
//        linkedStrings.addMiddleNode(2, "middle string");
        linkedStrings.printListMy();
//        linlist.addMiddleNode(2, 30);
        System.out.println(linkedStrings.size);
        System.out.println(linlist.size);
        linlist.printListMy();
        linlist.addFirstNode(89);
        linlist.addLastNode(13);
        linlist.printListMy();
        linlist.removeNode(5);
        System.out.println(linlist.size);
        linlist.printListMy();



    }


}
