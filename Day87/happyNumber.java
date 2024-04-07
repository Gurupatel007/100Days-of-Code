package Day87;

import java.util.HashSet;

public class happyNumber {
    public boolean isHappy(int n) {
        int temp = n;
        HashSet<Integer> seen = new HashSet<>();
        
        while(temp!=1){
            if(!seen.add(temp)){
                return false;
            }           
            
            temp = sumOfSquares(temp);
        }
        return true;
    }
    private int sumOfSquares(int temp){
        int sum = 0;
        while(temp > 0){
            int rem = temp%10;
            sum += rem*rem;
            temp/=10;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        happyNumber obj = new happyNumber();
        int n = 19;
        System.out.println(obj.isHappy(n));
    }
}
