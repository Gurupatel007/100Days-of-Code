public class GCD_or_HCF {
    public static int calcGCD(int n, int m){
        // Euclidian algo
        while(n>0 && m>0){
            if(n>m) n=n%m;
            else m = m%n;
        }
        if(m==0) return n;
        else return m;
    }
    public static void main(String[] args) {
        System.out.println(calcGCD(10,15));
    }
}