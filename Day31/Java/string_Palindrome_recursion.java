public class string_Palindrome_recursion {
    static boolean checkpalindrome(int i,String str){
        if(i>=(str.length()/2)) return true;
        else if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return checkpalindrome(i+1,str);
    }
    static boolean isPalindrome(String str) {
        return checkpalindrome(0,str);
    }
    public static void main(String[] args){
        String str = "madam";
        boolean ans = (isPalindrome(str));
        System.out.println(ans);
    }
    
}
