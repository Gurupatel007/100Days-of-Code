import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentEle = nums[i];
            int moreNeeded = target - currentEle;
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;

                return ans; 
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}