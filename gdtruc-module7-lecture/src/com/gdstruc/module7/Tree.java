package com.gdstruc.module7;

public class Tree {

    private Node root;

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public int getMin()
    {
        if(root == null)
        {
            System.out.println("Tree is Empty.");
            return -1;
        }
        while (root.getLeftChild() != null)
        {
            root = root.getLeftChild();
        }
        return root.getData();
    }

    public int getMax()
    {
        if(root == null)
        {
            System.out.println("Tree is Empty.");
            return -1;
        }
        while (root.getRightChild() != null)
        {
            root = root.getRightChild();
        }
        return root.getData();
    }

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        }
    }
}
