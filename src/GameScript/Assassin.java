package GameScript;

import enemies.EnemyModel;
import heroes.HeroModel;
import storage.WeaponsInventory;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Assassin extends HeroModel {

    public Assassin(String name, String jobOccupation, double healthBar) {
        super(name, jobOccupation, healthBar);


    }

    Scanner userInput = new Scanner(System.in);
    public void battleWithSlime (){

        WeaponsInventory brokenSword = new WeaponsInventory("Sword",15.00,4.00);
        WeaponsInventory brokenSpear = new WeaponsInventory("Spear",20.00,5.00);
        WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword",9.00,35.00);


        HeroModel assassin = new HeroModel("messi", "assassin", 50.0);


        EnemyModel slime = new EnemyModel("Slime 1", "Slime",10.0,brokenSpear);

        while (slime.getHealthBar() != 0){
            System.out.println("You have encountered a menacing looking slime approaching towards you with " +
                    "\nmenacing intent ");
            System.out.println("The battle has started");

            System.out.println("What shall you do? " +
                    "\n1.Fight" +
                    "\n2.Run");
            int option = userInput.nextInt();

            if (option == 2){
                double punchdamage = 5;
                double assassinHealth = 50.0;
                double slimeHealth= 10;
                double slimeMucus= 5;
                System.out.println("You have no inventory so far so you use your fist" +
                        "\n for a light blow of " + punchdamage + " damage");
                slimeHealth -= punchdamage;
                slime.setHealthBar(slimeHealth);
                System.out.println("slime:" + slime.getHealthBar());
                System.out.println("The slime took a menacing blow ");

                System.out.println("Now for Slimes turn");
                System.out.println("The slime has vomited out acidic mucus which hit you for " + slimeMucus + "Damage");

                assassinHealth -= slimeMucus;

                assassin.setHealthBar(assassinHealth);

                System.out.println(assassin.getHealthBar() + "\nIt has little effect on you");

            }




        }

    }
}
