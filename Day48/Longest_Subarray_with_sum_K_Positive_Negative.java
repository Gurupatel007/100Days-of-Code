import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_with_sum_K_Positive_Negative{
    public static int getLongestSubarray(int []nums, int k) {
		Map<Long,Integer> preSumMap = new HashMap<>();
		long sum = 0;
		int maxLen = 0;

		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum==k){
				maxLen = Math.max(maxLen,i+1);
			}
			long rem = sum-k;
			if(preSumMap.containsKey(rem)){
				int len = i-preSumMap.get(rem);
				maxLen = Math.max(maxLen,len);
			}
			if(!preSumMap.containsKey(sum)){
				preSumMap.put(sum,i);
			}
		}
		return maxLen;
	}
    public static void main(String[] args) {
        int k = 2;
        int []nums = { -1, 2, 1, 0, 1};
        int ans = getLongestSubarray(nums, k);
        System.out.println("Max Subarray length: "+ans);
    }
}