public class palindrome_leetcode {
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (right >= left) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;                
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }    
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + result);
    }
}
