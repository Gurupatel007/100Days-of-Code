public class SubArraySumEqualsK_SOLUTION2 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += nums[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        SubArraySumEqualsK_SOLUTION2 obj = new SubArraySumEqualsK_SOLUTION2();
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(obj.subarraySum(nums, k));
    }
}