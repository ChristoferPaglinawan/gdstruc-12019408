package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void discard(CardStack discardedPile, LinkedList<Card> hand)
    {
        System.out.println("Please input how many cards you want to discard:");


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 0; i < input; i++)
        {
            discardedPile.push(hand.pop());
        }
    }

    public static void drawCard(LinkedList<Card> hand,CardStack playerDeck)
    {
        int min = 1;
        int max = 4;

        Scanner pause = new Scanner(System.in);

        Random random = new Random();

        int value = random.nextInt(max + min) + min;

        System.out.println("Drawing " + value + " cards.");

        for (int i = 0; i < value; i++)
        {
            hand.push(playerDeck.pop());
        }
        pause.nextLine();
    }

    public static void drawDiscCard(CardStack discardedPile, LinkedList<Card> hand)
    {
        System.out.println("Please input how many cards you want to draw from the Pile:");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 0; i < input; i++)
        {
            hand.push(discardedPile.pop());
        }
    }

    public static void main(String[] args) {

        Scanner pause = new Scanner(System.in);

        CardStack playerDeck = new CardStack();

        CardStack discardedPile = new CardStack();

        LinkedList<Card> hand = new LinkedList<Card>();

        playerDeck.push(new Card(1,"Desire"));
        playerDeck.push(new Card(2,"Ghost"));
        playerDeck.push(new Card(3,"Summah"));
        playerDeck.push(new Card(4,"Solar"));
        playerDeck.push(new Card(5,"Kumeleone"));
        playerDeck.push(new Card(6,"Jaygod"));
        playerDeck.push(new Card(7,"Teeji"));
        playerDeck.push(new Card(8,"Brydogs"));
        playerDeck.push(new Card(9,"Pocar1"));
        playerDeck.push(new Card(10,"Dreamy"));
        playerDeck.push(new Card(11,"fattoriku"));
        playerDeck.push(new Card(12,"Gosha"));
        playerDeck.push(new Card(13,"S1NX"));
        playerDeck.push(new Card(14,"meyo"));
        playerDeck.push(new Card(15,"Calidad"));
        playerDeck.push(new Card(16,"Ador"));
        playerDeck.push(new Card(17,"Naz"));
        playerDeck.push(new Card(18,"Hackerman"));
        playerDeck.push(new Card(19,"Weakplayah"));
        playerDeck.push(new Card(20,"YungEmuxx"));
        playerDeck.push(new Card(21,"chilimansi"));
        playerDeck.push(new Card(22,"toyomansi"));
        playerDeck.push(new Card(23,"Drii"));
        playerDeck.push(new Card(24,"jones"));
        playerDeck.push(new Card(25,"invy"));
        playerDeck.push(new Card(26,"FireSaiyajin"));
        playerDeck.push(new Card(27,"DarkuDoraemon"));
        playerDeck.push(new Card(28,"xavi8k"));
        playerDeck.push(new Card(29,"qian"));
        playerDeck.push(new Card(30,"Kiera"));

        drawCard(hand, playerDeck);
        System.out.println(hand.toString());
        System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
        System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
        pause.nextLine();

        while (!playerDeck.isEmpty())
        {
            int min = 1;
            int max = 2;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            switch(value) {
                case 1: drawCard(hand, playerDeck);
                    System.out.println(hand.toString());
                    System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                    System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
                case 2: discard(discardedPile, hand);
                    System.out.println(hand.toString());
                    System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                    System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
                case 3: drawDiscCard(discardedPile,hand);
                    System.out.println(hand.toString());
                    System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                    System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
            }



        }

    }
}
