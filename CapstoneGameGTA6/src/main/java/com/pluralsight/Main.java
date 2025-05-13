package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Warrior player = new Warrior("YearUp Warrior", 40, 8);
        Enemy monster = new Enemy("NullPointerException", 30, 6);


        boolean isPlayerTurn = true;
        while (player.isAlive() && monster.isAlive()) {
            System.out.println("Your turn!!");


            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("  🧙‍♂️💻   WELCOME TO THE CODE DUNGEON!   🐉⚔️   ");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.println("     A wild " + monster.name + " appears!");

            while (player.isAlive() && monster.isAlive() && isPlayerTurn) ;
            {
                System.out.println("\nYour HP: " + player.hp + " | Enemy HP: " + monster.hp);
                System.out.println("\nChoose an action:");
                System.out.println("1. Attack");
                System.out.println("2. Fireball");
                System.out.println("3. Heal");
                System.out.println("4. HP Spin Attack");
                System.out.println("5. Run");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        player.attack(monster);
                        break;
                    case 2:
                        player.fireball(monster);
                        break;
                    case 3:
                        player.heal();
                        break;
                    case 4:
                        player.hpSpinAttack(monster);
                        break;
                    case 5:
                        player.run();
                        break;
                    default:
                        System.out.println("Invalid input. Try again");
                }

            }
        }
    }
}

