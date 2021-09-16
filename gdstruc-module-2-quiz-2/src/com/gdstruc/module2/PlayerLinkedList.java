package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    public int size = 0;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
    }

    public PlayerNode removeFirstNode() {
        PlayerNode poppedPlayer = head;
        head = head.getNextPlayer();
        size--;
        return poppedPlayer;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer() == player) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;

        int index = 0;

        while (current != null) {
            if (current.getPlayer() == player) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

}
