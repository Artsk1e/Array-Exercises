import java.util.Scanner;
import java.util.Arrays;

public class NameTag {

    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);

       String[] list = new String[3];

       System.out.println("Enter 1 to continue: ");
       
       int start = scn.nextInt();
       scn.nextLine();

       if ( start == 1) {
       System.out.println("List Your 3 Friends");
       for (int i=0; i<list.length; i++){
        System.out.println("Friend" + (i+1) + ": ");

        list[i] = scn.nextLine();
       }

       
       System.out.println("Friend List: " + Arrays.toString(list));
       } else {
        System.out.println("Okay.");
       }
       scn.close();
       
        
    }
    
}
