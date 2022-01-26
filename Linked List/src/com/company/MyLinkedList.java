package com.company;

/*
* Singly Linked List
*
* Created by: Seth Reeise
* January 26th 2022
 */

// This is my manual implementation of a singly linked list in Java

public class MyLinkedList {

    // Used as a struct
    public class Node {
        int value;
        Node next;
    }

    // Create head node
    Node head;

    // Add new node to the start of the linked list
    void addToStart(int newNodeValue) {
        // Create new node
        Node newNode = new Node();
        newNode.value = newNodeValue;

        // Assign tmp node's next "pointer" to the current head node therefore placing it in front of the list
        newNode.next = head;

        // Assign as head node
        head = newNode;
    }

    // Add new node to the end of the linked list
    void addToEnd(int newNodeValue) {
        // Create new node
        Node newNode = new Node();
        newNode.value = newNodeValue;

        // Assign tmp node to head to traverse through linked list
        Node tmp = head;

        // Traverse through linked list until the end is reached
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        // Assign new node to the end of the list
        tmp.next = newNode;
    }

    // Find node from value given
    void findNode(int value) {
        Node tmp = head;

        while (tmp.next != null) {
            if (tmp.value == value) {
                System.out.println("Found node with with value of: " + tmp.value);
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("Node not found");
    }

    public StringBuilder toStringBuilder() {
        Node tmp = head;
        StringBuilder result = new StringBuilder();

        while (tmp != null) {
            result.append(Integer.toString(tmp.value)).append(" - ");
            tmp = tmp.next;
        }
        return result;
    }
}
