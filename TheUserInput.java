import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class TheUserInput {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Array Creator!");
        System.out.println("How many numbers?(0-10): ");

        int number = scn.nextInt();

        if (number < 10){
        int [] list = new int[number];
        for (int i=0; i<list.length; i++) {
            System.out.println("Enter Number" + (i+1) + ": ");

            list[i]= scn.nextInt();
            
        }
        System.out.println("Your Array: " + Arrays.toString(list));
    }
    else {
        System.out.println("Invalid.");
    }scn.close();
}
}
