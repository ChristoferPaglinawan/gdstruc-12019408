package com.gdstruc.module4;

public class Main {

    public static void main(String[] args) {
	    ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1, "aceu", 100));
        queue.add(new Player(2, "Sinatraa", 100));
        queue.add(new Player(3, "Subroza", 100));
        queue.add(new Player(4, "ploo", 100));

        queue.printQueue();
        queue.add(new Player(5, "tenz", 95));
        queue.add(new Player(5, "tenz", 95));
        System.out.println("After adding another element: \n");
        queue.printQueue();
    }
}
