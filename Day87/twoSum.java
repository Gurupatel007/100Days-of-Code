package Day87;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int currEle = nums[i];
            int remaining = target - currEle;
            
            if(map.containsKey(remaining)){
                int eleIndex = map.get(remaining);
                return new int[]{eleIndex,i};
            }
            map.put(currEle,i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        twoSum obj = new twoSum();
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(obj.twoSum(arr, target)));
    }
}
