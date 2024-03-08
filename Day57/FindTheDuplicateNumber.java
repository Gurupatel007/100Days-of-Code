import java.util.HashSet;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            if(h.contains(i)) return i;
            else h.add(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));   
    }
}