package com.gdstruc.module3;

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static int randomPlayerIdGenerator()
    {
        Random random = new Random();

        int min = 1;
        int max = 99;

        int value = random.nextInt(max + min) + min;
        return value;
    }

    public static void main(String[] args) {
        int gameCounter = 0;
        int playerCounter = 0;
        int min = 1;
        int max = 7;

        ArrayQueue queue = new ArrayQueue(10);

        Scanner pause = new Scanner(System.in);

        while (gameCounter != 10)
        {
            int player = (int) (Math.random() * (max - min + 1) + min);

            System.out.println("Queuing Players!");

            for(int i = 0; i < player; i++)
            {
                int playerId = randomPlayerIdGenerator();
                queue.add(new Player(playerId));
                playerCounter++;
            }

            pause.nextLine();
            queue.printQueue();
            System.out.println(" ");

            if (playerCounter >= 5)
            {
                System.out.println("Starting game!");
                for (int j = 0; j < 5; j++)
                {
                    System.out.println("Popping: " + queue.remove());
                    playerCounter--;
                }
                gameCounter++;
                pause.nextLine();
            }
        }
    }
}