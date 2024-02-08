public class GCD {
	
	public static int gcd(int a,int b)
	{
		while(a>0 && b>0){
            if(a>b) a=a%b;
            else b = b%a;
        }
        if(a==0) return b;
        else return a;
	}
        public static void main(String[] args) {
        System.out.println(gcd(10,15));
    }		
}
