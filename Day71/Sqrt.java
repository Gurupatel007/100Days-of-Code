public class Sqrt {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int left = 1;
        int right = x;
        int res=0;
        while(left<=right){
            int mid = left + (right-left)/2;
            long square = (long) mid*mid;
            if(square > x){
                right = mid-1;
            }
            else if(square < x){
                left = mid+1;
                res = mid;
            }
            else return mid;
        }
        return res;
    }
    public static void main(String[] args) {
        Sqrt obj = new Sqrt();
        int x = 8;
        System.out.println(obj.mySqrt(x));
    }
}