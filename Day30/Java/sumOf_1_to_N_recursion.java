public class sumOf_1_to_N_recursion {
    static long printSum(long x){
        if(x==0) return 0;
        return x+printSum(x-1);
    }
    public static long sumFirstN(long n) {
        long ans = printSum(n);
        return ans;
    }
    public static void main(String[] args) {
        long n = 5;
        System.out.println(sumFirstN(n));
    }
    
}
