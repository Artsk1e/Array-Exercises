import java.util.Arrays;
import java.util.Collections;
public class PrintArray {
    public static void main(String[] args){
        
       Integer [] list = {5, 2, 1, 5, 7};

       Arrays.sort(list, Collections.reverseOrder());

       System.out.println("Reverse Sorted Arrays: " + Arrays.toString(list));

    }
}