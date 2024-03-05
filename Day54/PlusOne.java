import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 1;
        int carry = 0;
        List<Integer> ls = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            sum+=digits[i];
            carry = sum/10;

            if(carry!=0){
                sum = sum%10;
                ls.add(sum);
                sum = carry;
            }
            else {
                ls.add(sum % 10);
                sum = 0;
            }
        }
        if(carry!=0){
            ls.add(carry);
        }
        Collections.reverse(ls);
        int[] ans = new int[ls.size()];
        for(int i = 0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {9};
        int[] ans = plusOne(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}