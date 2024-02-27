public class Max_ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else count=0;
            if(max<count) max=count;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
