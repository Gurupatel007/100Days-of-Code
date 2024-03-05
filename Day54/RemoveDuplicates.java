public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
