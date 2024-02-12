public class Fibonacci_Number_Leetcode {
    static int fibo(int n){
        if(n<=1) return n;
        int last = fibo(n-1);
        int slast = fibo(n-2);
        return last + slast;
    }
    static int fib(int n) {
        int ans = fibo(n);
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int ans = fib(n);
        System.out.println(ans);
    }

}
