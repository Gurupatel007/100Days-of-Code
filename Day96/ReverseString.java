import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        int l = 0;
        int r = s.length-1;
        reverse(s,l,r);
        System.out.println(Arrays.toString(s));
    }
    static void reverse(String[]s , int l, int r){
        if(l>r) return;
        String temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        reverse(s,l+1,r-1);
    }
}
