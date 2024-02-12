public class Print_Fibonacci_Series {
    static void fibo(int i,int n,int[] nums){
        if(i>=n){
            return;
        }
        nums[i] = nums[i-1]+nums[i-2];
        fibo(i+1,n,nums);
    }
    static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] result = new int[n];
        result[0] = 0;
        if(n==1){
            return result;
        }
        result[1] = 1;
        fibo(2,n,result);
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] result = generateFibonacciNumbers(n);
        for(int i:result){
            System.out.print(i+" ");
        }
    }

}
