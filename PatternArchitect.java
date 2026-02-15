import java.util.Scanner;
public class PatternArchitect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give a Number(Max 10): ");
        int number = scn.nextInt();

        for (int i = 1; i<=number; i++){
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }



        for (int i = number; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

// still need to recall.