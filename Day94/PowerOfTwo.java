public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(1)); // true
        System.out.println(obj.isPowerOfTwo(16)); // true
        System.out.println(obj.isPowerOfTwo(218)); // false
    }
}
