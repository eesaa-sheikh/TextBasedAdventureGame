package enemies;

import storage.WeaponsInventory;

import java.util.ArrayList;
import java.util.List;

public class EnemyModel {
    private String name;
    private String enemyType;
    private WeaponsInventory weaponLoot;
    private double healthBar;

    public EnemyModel(String name, String enemyType, double healthBar, WeaponsInventory weaponLoot) {
        this.name = name;
        this.enemyType = enemyType;
        this.weaponLoot = weaponLoot;
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

    public  WeaponsInventory getWeaponLoot() {
        return weaponLoot;
    }

    public void setWeaponLoot(WeaponsInventory weaponLoot) {
        this.weaponLoot = weaponLoot;
    }

    public double getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(double healthBar) {
        this.healthBar = healthBar;
    }


}
