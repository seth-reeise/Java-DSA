package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        // populate linked list
        for (int i = 0; i < 25; i++) {
            list.add(i);
        }

        System.out.println(list);

        reverse(list);

        System.out.println(list);

    }

    static void reverse(LinkedList<Integer> list) {
        int temp;
        int size = list.size();

        /*
         * size / 2
         * for an even number of nodes, every node will swap
         * for an odd number of nodes, integer division is performed so the middle node stays in place and every other node swaps
         */
        for (int i = 0; i < size/2; i++) {
            // store the current node to be swapped, so we don't lose it
            temp = list.get(i);
            // set the current node to the last node minus i
            list.set(i, list.get(size - 1 -i));
            // set the last node - i with prev current node
            list.set(size - 1 -i, temp);
        }
    }
}
