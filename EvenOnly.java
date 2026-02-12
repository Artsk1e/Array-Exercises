import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int [] arr = new int[10];
        int i;
        for(i = 0; i < 10; i++) {
            System.out.println("Enter 1Integer: " +(i+1));
            arr[i] = scn.nextInt();

        }
        
        for(i=0; i<10; i++){
            if (arr[i] % 2 == 0){
                System.out.println("Even Number: "+ arr[i]);
            }
        }
        scn.close();
    }
}
