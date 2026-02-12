import java.util.Arrays;
import java.util.Scanner;


public class ScoreboardAnalyzer {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Games played: ");

        int games = scn.nextInt();

        int [] scores = new int[games];
        scn.nextLine();

        System.out.println("What are the Scores of your game?");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Game " + (i+1));
            scores[i] = scn.nextInt();
            
        }
        int total = 0;

        for(int i = 0; i < scores.length; i++ ) {
            total = total + scores[i];
        }
        System.out.println("Total Score: " + total);
        double average = total / scores.length;

        System.out.println("Average score: " + average);
        scn.close();
    }
}
