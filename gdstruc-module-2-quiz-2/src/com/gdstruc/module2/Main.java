package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskJet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskJet);

        playerLinkedList.printList();
        System.out.print("Length of Linked List: " + playerLinkedList.getSize());
        System.out.println("");
        System.out.print(playerLinkedList.contains(asuna));
        System.out.println("");
        System.out.print(playerLinkedList.indexOf(hpDeskJet));
        System.out.println("");
        playerLinkedList.removeFirstNode();
        playerLinkedList.printList();


    }
}
