
import java.util.Arrays;
import java.util.Collections;
public class SortingPractice {
    public static void main(String[] args) {
        Integer [] ages = {45, 12, 88, 19, 31};

        Arrays.sort(ages, Collections.reverseOrder());

        System.err.println("Reverse Order: " + Arrays.toString(ages));


        
        
        
    }
}
