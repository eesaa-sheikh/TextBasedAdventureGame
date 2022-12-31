package heroes;

import GameScript.Assassin;
import com.sun.tools.javac.Main;
import enemies.BossBattle;
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

        TimeUnit.SECONDS.sleep(2);
        System.out.println("Your name is messi an up and coming assassin from a distant unknown tribe " +
                "\nAs a junior in this job occupation you have been given the task to reclaim a rare item that once " +
                "\nshowcased the tribes superiority in the lost cave");

        TimeUnit.SECONDS.sleep(5);
        System.out.println("Now that you know your mission, You bark off on your first adventure in the lost cave.");

        TimeUnit.SECONDS.sleep(5);
        System.out.println("\n30 days later.................");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("You locate the enormous cave with obliterated shrines, eminating a menacing aura");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("As walk through the cave, You see an enourmous door with a sword shaped keyhole");
        TimeUnit.SECONDS.sleep(5);


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
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You try to open the door but its too sturdy to budge");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You notice a spear shaped hole that looks like in can unlock the door.");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Let me check my inventory");
                if (!(assassin.getWeaponsInventory().contains(brokenSpearKey))) {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("you don't have the brokenSpearKey");

                } else {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("You used the BrokenSpearKey to Open the door");
                    break;
                }
            }

                if (option == 3) {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("You Look at the translation which seems to be an ancient language");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("The key to unlocking this path is of my enemy");


                }
            }

        if (option == 2) {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("You have decided to walk away");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("From the side of your eye, you notice a gelatenous liquid forming in a damp corner....");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Drip\nDrip\nDrip");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("You have encountered a menacing looking slime approaching towards you with " +
                        "\nmenacing intent ");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("The battle has started");
                battleWithSlime();


            }
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Now that you have The Broken Spear Key, press 1 to progress onto the next room");
        int advancedOption = userInput.nextInt();

        if (advancedOption == 1){
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Now that you unlocked the door, The broken spear key vanishes");
            assassin.weaponsInventory.remove(brokenSpearKey);
            if(assassin.weaponsInventory.isEmpty()){
                System.out.println("You enter the second room, twice as big as the previous room." +
                        "\nThe room has bones of humans and their remains covering the floor and " +
                        "\nthe gate to what seems to be adorned with beast skeletons, broken weapons" +
                        "\nand blood which adorned the door.");
            }
                System.out.println("What shall you do? " +
                        "\n1.Progress ahead" +
                        "\n2.Run away" );

            int choice = userInput.nextInt();

            if (choice == 1){
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You muster the courage to approach the door");
                } else {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Why are you running away from this crucial test!" +
                        "\nI thought you wanted prove yourself.");
            }
            TimeUnit.SECONDS.sleep(5);
            System.out.println("You slowly progress forward until you hear a deafining " +
                    "\ngrowl with a dangerous Aura." +
                    "\nOut of the shadows you see a  dark brown dog with blood foaming from the mouth. ");

            battleWithDog();

        }

        TimeUnit.SECONDS.sleep(5);
        System.out.println("After the harrowing Dog experience, You decide to enter the gate, nervously," +
                "\nyou have sweat driping down your forehead as you can see the physical manifestation of the " +
                "Mysterious aura eminatting from the gate. You know that is is you last battle to complete this " +
                "initiation stage.");

        TimeUnit.SECONDS.sleep(5);
        System.out.println("What shall you do? " +
                "\n1.Open the door" +
                "\n2.Run away");
        int endChoice = userInput.nextInt();

        while (endChoice != 1) {

            if (endChoice== 2){

                TimeUnit.SECONDS.sleep(5);
                System.out.println("You are soo close and you are running away! You need to this over");
                System.out.println("\n1.Yes I want to run Away!" +
                        "\n2.No I want to continue");

                int opChoice = userInput.nextInt();
                if (opChoice== 2) {
                    System.out.println("You run away with the tail between your legs. I am so disapointed." +
                            "\n Never come hear Again.");
                    break;
                }

                if (opChoice ==1){
                    System.out.println("That's more like it!");
                }

                }

        }

        if (endChoice == 2) {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("With the remaining courage you muster from the depth of your inner soul," +
                    "\nyou open the door.");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Heavy Breathing.......");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Who dares wake me from my Slumber......");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("You slowly draw your weapon out to engage in combat");

             battleWithBoss();
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

            TimeUnit.SECONDS.sleep(1);

            System.out.println("What shall you do? " +
                    "\n1.Fight" +
                    "\n2.Run");
            int option = userInput.nextInt();


            if (option == 1) {

                TimeUnit.SECONDS.sleep(1);

                System.out.println("You have no inventory so far so you use your fist" +
                        "\n for a light blow of " + punchdamage + " damage");
                slimeHealth -= punchdamage;
                slime.setHealthBar(slimeHealth);
                TimeUnit.SECONDS.sleep(1);

                System.out.println("slime:" + slime.getHealthBar());
                TimeUnit.SECONDS.sleep(1);

                System.out.println("The slime took a menacing blow ");
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Now for Slimes turn");
                TimeUnit.SECONDS.sleep(1);

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
                System.out.println("You have obtained a crucial item from the slime ");
                assassin.weaponsInventory.add(slime.getWeaponLoot());
                System.out.println(assassin.getWeaponsInventory());
            }
            if (option == 2) {
                System.out.println("The Slime has blocked your exit Route. You must fight");
            }
        }
    }













        Scanner battleInput = new Scanner(System.in);

        public void battleWithDog() throws InterruptedException {
            WeaponsInventory brokenSword = new WeaponsInventory("Sword", 15.00, 4.00);
            WeaponsInventory brokenSpear = new WeaponsInventory("Spear", 20.00, 5.00);
            WeaponsInventory brokenSpearKey = new WeaponsInventory("Key", 0.00, 0.00);
            WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword", 9.00, 35.00);


            HeroModel assassin = new HeroModel("messi", "assassin", 50.0);


            EnemyModel dog = new EnemyModel("dog 1", "Dog", 20.0, brokenSword);

            //Battle Stats
            double punchdamage = 5;
            double assassinHealth = assassin.getHealthBar();
            double dogHealth = 20;
            double dogBite = 7;
            double dogAttacksYouRunningAway = 3;

            while (dog.getHealthBar() != 0) {

                TimeUnit.SECONDS.sleep(1);

                System.out.println("What shall you do? " +
                        "\n1.Fight" +
                        "\n2.Run");
                int option = userInput.nextInt();


                if (option == 1) {

                    TimeUnit.SECONDS.sleep(1);

                    System.out.println("You have no inventory so far so you use your fist" +
                            "\n for a light blow of " + punchdamage + " damage");
                    dogHealth -= punchdamage;
                    dog.setHealthBar(dogHealth);
                    TimeUnit.SECONDS.sleep(1);

                    System.out.println("Dog:" + dog.getHealthBar());
                    TimeUnit.SECONDS.sleep(1);

                    System.out.println("The dog took a substantial blow ");
                    TimeUnit.SECONDS.sleep(1);

                    System.out.println("Now for Dogs turn");
                    TimeUnit.SECONDS.sleep(1);

                    System.out.println("The dog has clawed you for " + dogBite + "Damage");

                    assassinHealth -= dogBite;

                    assassin.setHealthBar(assassinHealth);

                    System.out.println(assassin.getHealthBar() + "\nIt has little effect on you");

                }
                if (dog.getHealthBar() == 0) {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("You have defeated the dog");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You have beaten your second enemy!");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(":)");
                    System.out.println("You have obtained a crucial item from the Dog ");
                    assassin.weaponsInventory.add(dog.getWeaponLoot());
                    System.out.println(assassin.getWeaponsInventory());
                }
                if (option ==2){
                    System.out.println("The Dog has caught up to you and bit you. You must fight");

                    assassinHealth -= dogAttacksYouRunningAway;

                    assassin.setHealthBar(assassinHealth);

                    System.out.println(assassin.getHealthBar() +" You have to fight the dog ");

                }

                }

            }

    Scanner bossBattleInput = new Scanner(System.in);

    public void  battleWithBoss() throws InterruptedException {
                WeaponsInventory brokenSword = new WeaponsInventory("Sword", 15.00, 4.00);
                WeaponsInventory TheEmperorsSword = new WeaponsInventory("TheEmporersSword", 9.00, 35.00);


                HeroModel assassin = new HeroModel("messi", "assassin", 50.0);
                BossBattle bossBattle = new BossBattle("Roy Keane", "Legendary Dragon", 50.00,TheEmperorsSword);



                //battle Stats
                double attackWithSword = 5 + brokenSword.getAttackDamage();
                double assassinHealth = assassin.getHealthBar();
                double bossHealth = bossBattle.getHealthBar();
                double royKeaneSlideTackle = 10;
                double bossBattleStopsYouFromLeaving = 10;

        while (bossBattle.getHealthBar() != 0) {

            TimeUnit.SECONDS.sleep(1);

            System.out.println("What shall you do? " +
                    "\n1.Fight" +
                    "\n2.Run");
            int option = userInput.nextInt();


            if (option == 1) {

                TimeUnit.SECONDS.sleep(1);

                System.out.println("You have no inventory so far so you use your fist" +
                        "\n for a light blow of " + attackWithSword + " damage");
                bossHealth -= attackWithSword;
                bossBattle.setHealthBar(bossHealth);
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Dog:" + bossBattle.getHealthBar());
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Roy Keane took a substantial blow ");
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Now for Dogs turn");
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Roy keane stares you down, running towards you for a devastating slide tackle " + royKeaneSlideTackle + " Damage");

                assassinHealth -= royKeaneSlideTackle;

                assassin.setHealthBar(assassinHealth);

                System.out.println(assassin.getHealthBar() + "\nIt has a substancial effect on you");

            }
            if (bossBattle.getHealthBar() == 0) {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You have defeated the the Final boss");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You have beaten the boss of this cave!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(":)");
                System.out.println("You have obtained the key item from a  ");
                assassin.weaponsInventory.add(bossBattle.getRareweaponLoot());
                System.out.println(assassin.getWeaponsInventory());
            }
            if (option ==2){
                System.out.println("The Dog has caught up to you and bit you. You must fight");

                assassinHealth -= bossBattleStopsYouFromLeaving;

                assassin.setHealthBar(assassinHealth);

                System.out.println(assassin.getHealthBar() +" You have to fight Roy Keane or he will cuss you out. ");

            }

        }

    }




            }





