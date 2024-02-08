public class sumofAllDivisors {
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(10));
    }
}