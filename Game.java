import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    public static void main(String[] args) {

        //System Objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game Variables
        String[] enemies = {"Zeus", "Hera", "Poseidon", "Hades", "Demeter", "Athena", "Apollo", "Artemis", "Ares",
                "Hephaestus", "Aphrodite", "Hermes", "Hestia", "Dionysus", "Cronos"};
        
        int maxEnemyHealth = 5000; //Enemies Health
        int maxEnemyAttackDamage = 500; //Enemies Attack Damage
        int enemyDefense = 250; //Enemy Defense or resistance to your attack

        //Player Variables
        int health = 100; //PLayer Health
        int attackDamage = 500; //How much damage player does to opponents
        int numHealthPots = 5;  //How much heals the player gets
        int healthPotionHealthAmount = 500; //How much Health is regenerated
        int healthPotionDropChance = 50; // 50% chance for a health potion to drop
        int Defense = 100; //depends on how much attack they have for the player to either block or not

        //Game Ending Variables
        int numEnemyDefeated = 0; //variable for how many times the gods will die
        int numEnemyRequiredtoKill = 15; //variable for how many gods their are
        int enemyNeededtoKill = numEnemyRequiredtoKill - numEnemyDefeated; //variable for how the code will calculate the lack of gods and when it hits 0, the game will end.

        boolean running = true;

        System.out.println("Welcome to the Fight against Olympus!");
        System.out.println("Hello there Warrior, You have been summoned in this pathetic world to end the reign of the Gods."
                + "\nThat is right, I mean what I mean. You will have to kill 15 gods, each of them are very powerful"
        +"\nand have a lot of health and attack. But, fear not!!! For I shall bestow you these 5 Health Potions that will" +
                "\nhelp you and grant you the blessing of defense and attack. With this You shall destroy the petty 15 " +
                "\ngods and end their reign of terror. I wish you luck, Oh Faithful Warrior!");

        GAME:
        while (running) {

            System.out.println("-------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth); // randomly chooses the health of enemy between 0 and the amount inputted in the variable
            int enemyAttackDamage = rand.nextInt(maxEnemyAttackDamage); //randomly chooses the attack damage for the enemy
            String enemy = enemies[rand.nextInt(enemies.length)]; //randomly chooses an enemy from the array to fight with
            System.out.println("\t# " + enemy + " has appeared! #\n"); //Statement of showing what enemy has appeared

            while (enemyHealth > 0) {
                System.out.println("-------------------------------------------------");
                System.out.println("\tYour HP: " + health); //says how much health you have before entering battle
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth); //says how much health your enemy has before entering battle
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack"); //option to attack enemy
                System.out.println("\t2. Drink Health Potion"); //option to drink health potion
                System.out.println("\t3. Retreat"); //option to run away from enemy

                String input = in.nextLine();
                if (input.equals("1")) {     //Code of Running Option 1 of the 3 Options given to player
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    if (enemyDefense > damageDealt) {
                        health = health;
                        damageDealt = 0;
                        System.out.println("\t> " + enemy +"'s defense is too strong, your attack was nullified");
                    } else {
                        enemyHealth -= (damageDealt -= 0.2 * enemyDefense);
                    }

                    if (Defense > damageTaken) {
                        health = health;
                        System.out.println("\t> Your Defense is strong, you nullified " + enemy +"'s attack!");
                        damageTaken = 0;
                    } else {
                        health -= (damageTaken -= 0.3 * Defense);
                    }

                    System.out.println("\t> You strike to " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You have taken " + damageTaken + " damage from the " + enemy);

                    if (health <= 0) {
                        System.out.println("\t> You have taken too much damage, you are too weak to fight on.");
                        break;
                    }
                } else if (input.equals("2")) {     //Code of Running Option 2 of the 3 Options given to player
                    if (numHealthPots > 0) {
                        health += healthPotionHealthAmount;
                        numHealthPots--;
                        System.out.println("\t> You drank a health potion, healing your self for " +
                                healthPotionHealthAmount + "." + "\n\t> Your current health is " + health + "."
                                + "\n\t> Your have " + numHealthPots + " potions of health remaining.\n");
                    } else {
                        System.out.println("\t> The player doesn't have any health potions left to use. Defeat " +
                                "the enemy for a chance to get one");
                    }
                } else if (input.equals("3")) {     //Code of Running Option 3 of the 3 Options given to player
                    System.out.println("\t> You run away from the " + enemy + "!");
                    continue GAME;

                } else { //Code for when the person inputs something else that don't match the inputs for the other 3 options
                    System.out.println("Please type either number 1 to Attack, number 2 to Heal, number 3 to Block,"
                            + "or number 4 to Run.");
                }
            }
            if (health < 1) { //If the warrior has no health, the game ends and this is the code for that.
                System.out.println("\t> You have retreated from the War, You were too weak for the Gods.");
                break;
            }
            System.out.println("-------------------------------------------------");
            System.out.println("# " + enemy + " has been defeated! #");
            System.out.println("# You have " + health + " HP left! # ");
            if (rand.nextInt(100) < healthPotionDropChance) { // The code for what are the chances of getting an health potion.
                numHealthPots++;
                System.out.println("# Congratulations, You have received a Health Potion! # ");
                System.out.println("# Your current amount of Health Potions are " + numHealthPots + "! #");
            }

            if (numEnemyDefeated >= 14) { // when all 15 gods are killed, the game will end.
                System.out.println("# Congratulations!!! You have completed your mission and you may return back " +
                        "home now. #");
                break;
            }
                else { // Code for Making sure that if the enemies are still below the 15 gods that are needed to kill it will count it up
                    numEnemyDefeated++;
                    enemyNeededtoKill = numEnemyRequiredtoKill - numEnemyDefeated;
                    System.out.println("# You only need " + enemyNeededtoKill + " more enemies to kill to WIN!!! #");
                }

            }

        }
    }


