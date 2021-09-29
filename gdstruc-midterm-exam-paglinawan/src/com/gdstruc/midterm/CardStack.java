package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    public int deckSize = 0;
    public int discSize = 0;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void setDeck(CardStack deck)
    {

    }
    public void push(Card card) // add cards
    {
        stack.push(card);
        deckSize++;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop() // draw card
    {
        discSize++;
        deckSize--;
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public int getDeckSize() {
        return deckSize;
    }

    public int getDiscSize() {
        return discSize;
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
