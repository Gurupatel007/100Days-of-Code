package Day70;

import java.util.HashMap;

public class SubArraySumEqualsK_SOLUTION1{
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            int rem = sum - k;

            if(map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        SubArraySumEqualsK_SOLUTION1 obj = new SubArraySumEqualsK_SOLUTION1();
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(obj.subarraySum(arr, k));
    }
}