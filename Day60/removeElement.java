package Day60;

public class removeElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int valid_size = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
