package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {
	Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

//        tree.traverseInOrder();      // Ascending Traversal

//        System.out.println(tree.getMin());  // Gets Minimum Node
        System.out.println(tree.getMax());  // Gets Maximum Node

//        tree.traverseInOrderDescending(); // Descending Traversal
    }
}
