import java.util.ArrayList;
import java.util.List;

public class Factorial_Number_Not_Greater_Than_N {
    static Long findFact(Long i){
        if(i==0 || i==1){
            return (long)1;
        }
        return i*findFact(i-1);
    }
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> ls = new ArrayList<Long>();
        for(Long i = (long)1;i<=n;i++){
            Long ans = findFact(i);
            if(ans > n) return ls;
            ls.add(ans);
        }
        return ls;
    }
}
