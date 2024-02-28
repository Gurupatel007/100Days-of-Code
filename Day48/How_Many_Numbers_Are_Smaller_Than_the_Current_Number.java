public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}