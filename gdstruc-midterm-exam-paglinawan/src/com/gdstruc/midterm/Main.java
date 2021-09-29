package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int randomNumberGenerator(int deckValue)
    {
        Random random = new Random();

        if (deckValue >= 5)
        {
            int min = 1;
            int max = 4;

            int value = random.nextInt(max + min) + min;

            return value;
        }

        else if (deckValue >= 4)
        {
            int min = 1;
            int max = 3;

            int value = random.nextInt(max + min) + min;

            return value;
        }

        else if (deckValue >= 3)
        {
            int min = 1;
            int max = 2;

            int value = random.nextInt(max + min) + min;

            return value;
        }

        else if (deckValue >= 2)
        {
            int min = 1;
            int max = 1;

            int value = random.nextInt(max + min) + min;

            return value;
        }
        else if (deckValue >= 1)
        {

            int value = 1;

            return value;
        }
        return 0;
    }

    public static void discard(CardStack discardedPile, LinkedList<Card> hand, int value) {
        System.out.println("Discarding " + value + " cards.");

        for (int i = 0; i < value; i++) {
            discardedPile.push(hand.pop());
        }
    }

    public static void drawCard(LinkedList<Card> hand, CardStack playerDeck, int value) {

        Scanner pause = new Scanner(System.in);

        System.out.println("Drawing " + value + " cards.");

        for (int i = 0; i < value; i++) {
            hand.push(playerDeck.pop());
        }
    }

    public static void drawDiscCard(CardStack discardedPile, LinkedList<Card> hand, int value) {
        System.out.println("Drawing " + value + " cards from Pile.");

        for (int i = 0; i < value; i++) {
            hand.push(discardedPile.pop());
        }
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 2;

        Scanner pause = new Scanner(System.in);

        CardStack playerDeck = new CardStack();

        CardStack discardedPile = new CardStack();

        LinkedList<Card> hand = new LinkedList<Card>();

        playerDeck.push(new Card(1, "Desire"));
        playerDeck.push(new Card(2, "Ghost"));
        playerDeck.push(new Card(3, "Summah"));
        playerDeck.push(new Card(4, "Solar"));
        playerDeck.push(new Card(5, "Kumeleone"));
        playerDeck.push(new Card(6, "Jaygod"));
        playerDeck.push(new Card(7, "Teeji"));
        playerDeck.push(new Card(8, "Brydogs"));
        playerDeck.push(new Card(9, "Pocar1"));
        playerDeck.push(new Card(10, "Dreamy"));
        playerDeck.push(new Card(11, "fattoriku"));
        playerDeck.push(new Card(12, "Gosha"));
        playerDeck.push(new Card(13, "S1NX"));
        playerDeck.push(new Card(14, "meyo"));
        playerDeck.push(new Card(15, "Calidad"));
        playerDeck.push(new Card(16, "Ador"));
        playerDeck.push(new Card(17, "Naz"));
        playerDeck.push(new Card(18, "Hackerman"));
        playerDeck.push(new Card(19, "Weakplayah"));
        playerDeck.push(new Card(20, "YungEmuxx"));
        playerDeck.push(new Card(21, "chilimansi"));
        playerDeck.push(new Card(22, "toyomansi"));
        playerDeck.push(new Card(23, "Drii"));
        playerDeck.push(new Card(24, "jones"));
        playerDeck.push(new Card(25, "invy"));
        playerDeck.push(new Card(26, "FireSaiyajin"));
        playerDeck.push(new Card(27, "DarkuDoraemon"));
        playerDeck.push(new Card(28, "xavi8k"));
        playerDeck.push(new Card(29, "qian"));
        playerDeck.push(new Card(30, "Kiera"));



        while (!playerDeck.isEmpty()) {

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            int  playerDeckCards;
            int playerDeckSize;
            int discardedCards;
            int discardedSize;
            int handCards;
            int handSize;

            playerDeckCards = playerDeck.getDeckSize();
            playerDeckSize = randomNumberGenerator(playerDeckCards);

            drawCard(hand, playerDeck, playerDeckSize);
            System.out.println(hand.toString());
            System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
            System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
            pause.nextLine();

            switch (value) {
                case 1:
                    if (!playerDeck.isEmpty())
                    {
                        playerDeckCards = playerDeck.getDeckSize();
                        playerDeckSize = randomNumberGenerator(playerDeckCards);
                        drawCard(hand, playerDeck,playerDeckSize);
                        System.out.println(hand.toString());
                        System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                        System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
                        pause.nextLine();
                    }

                case 2:
                    if (!hand.isEmpty())
                    {
                        handCards = hand.size();
                        handSize = randomNumberGenerator(handCards);
                        discard(discardedPile, hand, handSize);
                        System.out.println(hand.toString());
                        System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                        System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
                        pause.nextLine();
                    }

                case 3:
                    if (!discardedPile.isEmpty())
                    {
                        discardedCards = discardedPile.getDeckSize();
                        discardedSize = randomNumberGenerator(discardedCards);
                        drawDiscCard(discardedPile, hand, discardedSize);
                        System.out.println(hand.toString());
                        System.out.println("Number of remaining cards in player deck: " + playerDeck.getDeckSize());
                        System.out.println("Number of cards in discarded Pile: " + discardedPile.getDeckSize());
                        pause.nextLine();
                    }
            }
        }
    }
}
