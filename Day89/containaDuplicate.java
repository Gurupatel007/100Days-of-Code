package Day89;

import java.util.HashMap;

public class containaDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int currEle = nums[i]; // stored current element
            
            // checked whether the current element is there in hashmap or not and if it there => then the absolute subtraction of their indices are less than or equal to k
            if(hashmap.containsKey(currEle) && (Math.abs(hashmap.get(currEle) - i) <= k)){
                return true;
            }
            hashmap.put(currEle, i);
        }
        return false;
    }
    public static void main(String[] args) {
        containaDuplicate obj = new containaDuplicate();

        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(obj.containsNearbyDuplicate(nums, k));
    }
}
