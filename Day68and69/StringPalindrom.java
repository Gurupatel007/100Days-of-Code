package Day68and69;

public class StringPalindrom {
    int isPalindrome(String S) {
        int n = S.length();
        int start = 0;
        int end = n - 1;
    
        while (start <= end) {
            if (S.charAt(start) == S.charAt(end)) {
                start++;
                end--;
            } else {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String S = "abba";
        StringPalindrom obj = new StringPalindrom();
        System.out.println(obj.isPalindrome(S));
    }
}
