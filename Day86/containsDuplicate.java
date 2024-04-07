import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for(int num : nums){
            if(st.contains(num)){
                return true;
            }
            st.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        int[] arr = {1,2,3,1};
        System.out.println(obj.containsDuplicate(arr));
    }
}