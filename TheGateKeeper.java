import java.util.Scanner;

public class TheGateKeeper {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Movie Theater Critic program");
        System.out.println("Age: ");

        int age = scn.nextInt();

        if (age >= 13) {
            System.out.println("Money(tickets cost 12$):$ ");

        int money = scn.nextInt();
        int change = money - 12;
        if(money >= 12){
            System.out.println("Enjoy the show! Here is your $" + change + " 1change.");
        }else {
            System.out.println("Back to the arcade for you.");
        }
        } else {
            System.out.println("Too young!");
        }
        scn.close();
    }
}


// Exercise 1: The Gatekeeper (Conditionals & Scanner)
//Goal: Master input validation and logical branching.

//Task: Create a "Movie Theater Critic" program.

//Requirements: 1. Ask the user for their age and how much money they have in their pocket.
//2. A ticket costs $12.
//3. If they are under 13, they can't see the movie (print "Too young!").
//4. If they have enough money and are 13+, print "Enjoy the show! Here is your $[change] change."
//5. If they are old enough but broke, print "Back to the arcade for you."