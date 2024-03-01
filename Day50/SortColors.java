public class SortColors {
    public static void sortColors(int[] nums) {
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count_zero++;
            else if(nums[i]==1) count_one++;
            else count_two++;
        }
        for(int i=0;i<count_zero;i++){
            nums[i] = 0;
        }
        int end1 = count_zero+count_one;
        for(int i=count_zero;i<end1;i++){
            nums[i] = 1;
        }
        // int end2 = end1 + count_two;
        for(int i = end1;i<nums.length;i++){
            nums[i] = 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
