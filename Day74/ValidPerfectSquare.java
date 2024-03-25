public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long low = 1;
        long high = num;
        while(low<=high){
            long mid = low + (high-low)/2;
            long square = mid*mid;
            if(square==num) return true;
            else if(square<num) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidPerfectSquare obj = new ValidPerfectSquare();
        System.out.println(obj.isPerfectSquare(16)); // true
        System.out.println(obj.isPerfectSquare(14)); // false
    }
}