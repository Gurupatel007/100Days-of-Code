import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minMaxSum {
    static void miniMaxSum(List<Integer> arr) {
        arr = new ArrayList<>(arr); // Create a modifiable list
        Collections.sort(arr);
        
        // Calculate the sum of the first four elements for the minimum sum
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
        
        // Calculate the sum of the last four elements for the maximum sum
        long maxSum = 0;
        for (int i = arr.size() - 4; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        
        // Print the minimum and maximum sums
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        miniMaxSum(arr);
    }
}