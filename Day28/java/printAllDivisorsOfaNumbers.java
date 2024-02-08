import java.util.List;
import java.util.*;
public class printAllDivisorsOfaNumbers{
    public static List< Integer > printDivisors(int n) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i!=(n/i)){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(printDivisors(10));
    }
}