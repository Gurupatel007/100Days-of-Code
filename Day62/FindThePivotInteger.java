public class FindThePivotInteger {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int sumOfN = (n*(n+1))/2;
            int sum1 = (i*(i+1))/2;
            int sum2 = sumOfN - sum1 + i;
            if(sum1 == sum2) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        FindThePivotInteger obj = new FindThePivotInteger();
        System.out.println(obj.pivotInteger(n));
    }
}