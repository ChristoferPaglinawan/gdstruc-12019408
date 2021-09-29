package com.gdstruc.module3;

import java.util.Objects;

public class Player {
    private int playerId;
    private String userName;
    private int level;

    public Player(int playerId, String userName, int level) {
        this.playerId = playerId;
        this.userName = userName;
        this.level = level;
    }

    public int getplayerId() {
        return playerId;
    }

    public void setplayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && level == player.level && Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, level);
    }
}
