public class MaximumSubarray {
    static int maxSubArray(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max) max =sum;
            if(sum<0) sum = 0;
        }


        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
