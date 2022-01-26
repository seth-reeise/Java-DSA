package com.company;

/*
 * Singly Linked List
 *
 * Created by: Seth Reeise
 * January 26th 2022
 */

public class Main {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addToStart(12);
        linkedList.addToStart(18);
        linkedList.addToStart(99);

        System.out.println(linkedList.toStringBuilder());

        linkedList.addToEnd(350);
        linkedList.addToEnd(55);

        System.out.println(linkedList.toStringBuilder());

        linkedList.findNode(99);
    }
}
