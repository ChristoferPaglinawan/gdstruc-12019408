package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player( 1, "Ador", 100));
        playerList.add(new Player( 2, "Kiera", 205));
        playerList.add(new Player( 3, "Hackerman", 57));

        playerList.add(2, new Player(32, "Alpha", 360));

        playerList.remove(2);

//    System.out.println(playerList.contains(new Player(2, "Alpha", 360)));
        System.out.println(playerList.indexOf(new Player(2, "Kiera", 205 )));
//        for (Player p : playerList)
//        {
//            System.out.println(p);
//        }
    }
}
