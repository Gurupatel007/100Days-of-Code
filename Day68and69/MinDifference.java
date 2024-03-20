package Day68and69;
import java.util.Arrays;

public class MinDifference {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = k-1;
        int res = Integer.MAX_VALUE;
        while(right<n){
            res = Math.min(res,nums[right]-nums[left]);
            left++;
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        MinDifference obj = new MinDifference();
        System.out.println(obj.minimumDifference(nums, k));
    }
}
