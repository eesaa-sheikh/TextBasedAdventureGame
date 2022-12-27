package heroes;

import GameScript.Assassin;
import enemies.EnemyModel;
import storage.WeaponsInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HeroModel {
    private String name;
    private String jobOccupation;
    private ArrayList<WeaponsInventory> weaponsInventory;
    private double healthBar;

    public HeroModel(String name, String jobOccupation, double healthBar) {
        this.healthBar = healthBar;
        this.name = name;
        this.jobOccupation = jobOccupation;
        this.weaponsInventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobOccupation() {
        return jobOccupation;
    }

    public void setJobOccupation(String jobOccupation) {
        this.jobOccupation = jobOccupation;
    }

    public ArrayList<WeaponsInventory> getWeaponsInventory() {
        return weaponsInventory;
    }

    public void setWeaponsInventory(ArrayList<WeaponsInventory> weaponsInventory) {
        this.weaponsInventory = weaponsInventory;
    }

    public double getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(double healthBar) {
        this.healthBar = healthBar;
    }




    //assassin script
    public void assasinScript() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);


        WeaponsInventory brokenSword = new WeaponsInventory("Sword", 15.00, 4.00);
        WeaponsInventory brokenSpear = new WeaponsInventory("Spear", 20.00, 5.00);
        WeaponsInventory brokenSpearKey = new WeaponsInventory("Key", 0.00, 0.00);
        WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword", 9.00, 35.00);


        HeroModel assassin = new HeroModel("messi", "assassin", 50.0);


        EnemyModel slime = new EnemyModel("Slime 1", "Slime", 10.0, brokenSpearKey);

        //TimeUnit.SECONDS.sleep(2);
        System.out.println("Your name is messi an up and coming assassin from a distant unknown tribe " +
                "\n As a junior in this job occupation you have been given the task to reclaim a rare item that once " +
                "\n showcased thee tribes superiority in the lost cave");

        // TimeUnit.SECONDS.sleep(5);
        System.out.println("Now that you know your mission, You bark off on your first adventure in the lost cave.");

        // TimeUnit.SECONDS.sleep(5);
        System.out.println("\n30 days later.................");
        // TimeUnit.SECONDS.sleep(5);
        System.out.println("You locate the enormous cave with obliterated shrines, eminating a menacing aura");
        // TimeUnit.SECONDS.sleep(5);
        System.out.println("As walk through the cave, You see an enourmous door with a sword shaped keyhole");
        // TimeUnit.SECONDS.sleep(5);

        System.out.println("What shall you do? " +
                "\n1.Open the door" +
                "\n2.Walk away" +
                "\n3.Look at the enscription");

        int option = userInput.nextInt();
        while (option != 2) {

            System.out.println("What shall you do? " +
                    "\n1.Open the door" +
                    "\n2.Walk away" +
                    "\n3.Look at the enscription");
            if (option == 1) {
                System.out.println("You try to open the door but its too sturdy to budge");
                System.out.println("You notice a spear shaped hole that looks like in can unlock the door.");
                System.out.println("Let me check my inventory");
                if (!(assassin.getWeaponsInventory().contains(brokenSpearKey))) {
                    System.out.println("you dont have the brokenSpearKey");
                    break;
                }
            }

            if (option == 2) {
                System.out.println("You have decided to walk away");
                System.out.println("From the side of your eye, you notice a gelatenous liquid forming in a damp corner....");
                System.out.println("Drip\nDrip\nDrip");
                System.out.println("You have encountered a menacing looking slime approaching towards you with " +
                        "\nmenacing intent ");
                System.out.println("The battle has started");
                battleWithSlime();
            }

        }

    }


    Scanner userInput = new Scanner(System.in);

    public void battleWithSlime() throws InterruptedException {
        WeaponsInventory brokenSword = new WeaponsInventory("Sword", 15.00, 4.00);
        WeaponsInventory brokenSpear = new WeaponsInventory("Spear", 20.00, 5.00);
        WeaponsInventory brokenSpearKey = new WeaponsInventory("Key", 0.00, 0.00);
        WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword", 9.00, 35.00);


        HeroModel assassin = new HeroModel("messi", "assassin", 50.0);


        EnemyModel slime = new EnemyModel("Slime 1", "Slime", 10.0, brokenSpearKey);

        //Battle Stats
        double punchdamage = 5;
        double assassinHealth = 50.0;
        double slimeHealth = 10;
        double slimeMucus = 5;

        while (slime.getHealthBar() != 0) {
            System.out.println("What shall you do? " +
                    "\n1.Fight" +
                    "\n2.Run");
            int option = userInput.nextInt();


            if (option == 1) {

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
            if (slime.getHealthBar() == 0) {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You have defeated the slime");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You have beaten your first enemy!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(":)");
                assassin.weaponsInventory.add(slime.getWeaponLoot());
                System.out.println(assassin.weaponsInventory);
            }
        }
    }



    }