import GameScript.Assassin;
import heroes.HeroModel;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        HeroModel assassin = new HeroModel("messi", "assassin", 50.0);

        Scanner userInput = new Scanner(System.in);
        System.out.println("§§§§§§  Welcome to The Journey of a hero §§§§§");

        TimeUnit.SECONDS.sleep(2);
        System.out.println("Do you want to start your adventure?");

        System.out.println("1.Yes" + "\n2.No");

        int option = userInput.nextInt();

        //option menu
        while (option!=1){
            System.out.println("I am sorry to see you go");
            break;
        }
        if (option==1){
            System.out.println("Thats great");
            System.out.println("Please choose a hero class");
            System.out.println("1.Assassin" + "\n2.Berserker" + "\n3.Knight");
        }

        if (option==1){
            System.out.println("\nThats great");
            assassin.assasinScript();
        }

    }
}