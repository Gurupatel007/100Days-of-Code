import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n =nums.length;
        int m = (int)(n/2);
        if(n<=1) return  nums[0];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int currVal = 0;
            if(hm.containsKey(nums[i])){
                currVal = hm.get(nums[i]);
                currVal+=1;
                hm.put(nums[i], currVal);
                continue;
            }
            hm.put(nums[i], 1);
        }
        int index = -1;
        int Val = 0;
        int maxValue = 0;
        for(int i=0;i<n;i++){
            Val = hm.get(nums[i]);
            if(maxValue<Val){
                maxValue = Val;
                index = i;
            }
        }
        return nums[index];
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}