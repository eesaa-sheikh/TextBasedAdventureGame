package rooms;

import enemies.EnemyModel;
import heroes.HeroModel;

import java.util.ArrayList;
import java.util.List;

public class MainRoom {
    private String RoomName;
    private ArrayList<EnemyModel> enemies;
    private ArrayList<HeroModel>hero;

    public MainRoom(String roomName, ArrayList<EnemyModel> enemies, ArrayList<HeroModel> hero) {
        RoomName = roomName;
        this.enemies = enemies;
        this.hero = hero;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public ArrayList<EnemyModel> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<EnemyModel> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<HeroModel> getHero() {
        return hero;
    }

    public void setHero(ArrayList<HeroModel> hero) {
        this.hero = hero;
    }
}
