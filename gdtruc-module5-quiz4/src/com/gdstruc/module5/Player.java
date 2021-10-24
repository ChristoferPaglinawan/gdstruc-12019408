package com.gdstruc.module5;

import java.util.Objects;

public class Player {
    private int playerId;
    private String userName;
    private int level;

    public Player(int id, String name, int level) {
        this.playerId = id;
        this.userName = name;
        this.level = level;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player pLayer = (Player) o;
        return playerId == pLayer.playerId && level == pLayer.level && Objects.equals(userName, pLayer.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, level);
    }

    @Override
    public String toString() {
        return "PLayer{" +
                "playerId=" + playerId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }
}
