public class FindNthfibonacciNumber {
    public static void main(String[] args) {
//        fibonacci series : 0 1 1 2 3 5 8 13 . .. ..
        int n = 6;
        int ans = printFibo(n);
        int ans1 = directFibo(n);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int printFibo(int n){
        if(n<2){
            return n;
        }
        return printFibo(n-1) + printFibo(n-2);
    }
    static int directFibo(int n){
        return (int) (Math.sqrt(5) + (1 / Math.pow(2,n)));
    }
}
