import java.util.HashSet;

public class singleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
    public static void main(String[] args) {
        singleNumber obj = new singleNumber();
        int[] arr = {2,2,1};
        System.out.println(obj.singleNumber(arr));
    }
}
