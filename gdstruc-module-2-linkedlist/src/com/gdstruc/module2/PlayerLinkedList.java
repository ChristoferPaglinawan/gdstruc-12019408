package com.gdstruc.module2;

public class PlayerLinkedList {
    private  PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
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

    public void removeFirstNode()
    {
        PlayerNode current = head;
        head = current.getNextPlayer();
    }

    public int elementCounter ()
    {
       if (head == null)
       {
           return 0;
       }
       int count = 0;

       PlayerNode current = head;

       while(current != null)
       {
           count++;
           current=current.getNextPlayer();
       }
       return count;
    }

    public boolean containElement (Player player)
    {
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer() == player)
            {
                return true;
            }
            current=current.getNextPlayer();
        }
        return false;
    }

    public int findIndex (Player player)
    {
        PlayerNode current = head;

        int index = 0;

        while (current != null)
        {
            if(current.getPlayer() == player)
            {
                return index;
            }
            current=current.getNextPlayer();
            index++;
        }
        return 0;
    }

}
