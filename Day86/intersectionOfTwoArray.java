import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArray {
    public int[] intersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        for(int num : array1){
            set1.add(num);
        }
        
        for(int num1 : array2){
            if(set1.contains(num1)){
                intersection.add(num1);
            }
        }
        
        int[] ans = new int[intersection.size()];
        int i= 0;
        for(int num : intersection){
            ans[i++] = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        intersectionOfTwoArray obj = new intersectionOfTwoArray();
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(obj.intersection(arr1, arr2)));
    }    
}
