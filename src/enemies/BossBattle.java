package enemies;

import storage.WeaponsInventory;

import java.util.ArrayList;
import java.util.List;

public  class BossBattle {
    private String name;
    private String enemyType;
    private WeaponsInventory rareweaponLoot;
    private double healthBar;

    public BossBattle(String name, String enemyType, double healthBar,WeaponsInventory rareweaponLoot) {
        this.name = name;
        this.enemyType = enemyType;
        this.rareweaponLoot = rareweaponLoot;
        this.healthBar = healthBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public  WeaponsInventory getRareweaponLoot() {
        return rareweaponLoot;
    }

    public void setRareweaponLoot(WeaponsInventory rareweaponLoot) {
        this.rareweaponLoot = rareweaponLoot;
    }

    public double getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(double healthBar) {
        this.healthBar = healthBar;
    }



}
