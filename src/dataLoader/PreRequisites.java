package dataLoader;

import enemies.BossBattle;
import enemies.EnemyModel;
import heroes.HeroModel;
import storage.WeaponsInventory;

public class PreRequisites {

    // Hero models
    HeroModel assassin = new HeroModel("messi", "assassin", 50.0);
    HeroModel berserker = new HeroModel("Ronaldo", "Berserker", 100.0);
    HeroModel knight = new HeroModel("NeymarJr", "Knight", 75.00);

    // weapons model

    WeaponsInventory brokenSword = new WeaponsInventory("Sword",15.00,4.00);
    WeaponsInventory brokenSpear = new WeaponsInventory("Spear",20.00,5.00);
    WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword",9.00,35.00);



    //Enemy Slime Model

    EnemyModel slime = new EnemyModel("Slime 1", "Slime",10.0,brokenSpear);
    EnemyModel slime2= new EnemyModel("Slime 2", "Slime",10.0,brokenSpear);


    //Enemy Dog model

    EnemyModel dog = new EnemyModel("dog 1", "dog",5.0, brokenSword);
    EnemyModel dog2= new EnemyModel("dog 2", "dog",5.0,brokenSword);





    // Enemy boss model

    BossBattle bossBattle = new BossBattle("Roy Keane", "Legendary Dragon", 50.00,TheEmperorsSword);


}
