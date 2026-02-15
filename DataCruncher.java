import java.util.Scanner;

public class DataCruncher {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int [] temps = new int[5];

        int max = temps[0];
        for (int i = 0; i < 5; i++){
            System.out.println("Enter the Temperature the last 5 days");
            System.err.println("Day " + (i+1) + ":°C ");
            temps[i] = scn.nextInt();
        }

        for (int i=0; i < 5; i++){
            if (temps[i]>=max){
                max = temps[i];
            }
        }
        double sum = 0;

        for(int i=0; i < temps.length; i++){
            sum = sum + temps[i];
        }

        double average = sum / temps.length;
        System.out.println("The Average temperature in the Last 5 days: °C " + average);
        System.out.println("The Highest Temperature in the Last 5 Days: °C " + max);
    }
}


//Exercise 2: The Data Cruncher (Loops & Arrays)
//Goal: Move data into a structure and manipulate it.

//Task: Create a "Daily Temperature Tracker."

//Requirements:

//Create an array of 5 integers (representing 5 days of temps).

//Use a for loop to ask the user to input the temperature for each day.

//After the loop finishes, run a second loop to find the highest temperature in that array.

//Print the highest temp and the average temp of the week.