package Day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddToArrayForm {
    static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        List<Integer> ls = new ArrayList<>();
        for(int i=n-1;i>=0 || k>0;i--){
            int sum = carry;
            if(i>=0) sum+=num[i];
            if(k>0){
                sum+=k%10;
                k/=10;
            }
            ls.add(sum%10);
            carry = sum/10;
        }
        if(carry!=0) ls.add(carry);
        Collections.reverse(ls);
        return ls;
    }
    public static void main(String[] args) {
        // int[] num = {9,9,9,9,9,9,9,9,9,9};
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        System.out.println(addToArrayForm(num, k));
    }
}
