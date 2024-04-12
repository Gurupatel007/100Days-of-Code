package Day92;

import java.util.HashMap;
import java.util.Map;

public class FourSum2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        
        // Step 1: Compute all possible sums of pairs from nums1 and nums2 and record their counts
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
            }
        }
        
        int count = 0;
        
        // Step 2: For each pair from nums3 and nums4, find if the complement sum exists in map
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sum = num3 + num4;
                // Check for the negation of the sum in the first map
                count += sumCount.getOrDefault(-sum, 0);
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        FourSum2 obj = new FourSum2();
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(obj.fourSumCount(nums1, nums2, nums3, nums4)); // Output: 2
    }
}