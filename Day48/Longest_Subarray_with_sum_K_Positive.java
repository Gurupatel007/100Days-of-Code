public class Longest_Subarray_with_sum_K_Positive {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;

        while(right<n){
            while(sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=a[right];
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int k = 3;
        int []nums = { 1, 2, 1, 0, 1};
        int ans = longestSubarrayWithSumK(nums, k);
        System.out.println("Max Subarray length: "+ans);
    }
}
