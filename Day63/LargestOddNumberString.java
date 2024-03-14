// Source: https://leetcode.com/problems/largest-odd-number-in-string/
public class LargestOddNumberString {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((num.charAt(i) - '0') % 2 != 0) {
                // If it's odd, return the substring from the beginning to this digit (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
    public static void main(String[] args) {
        LargestOddNumberString obj = new LargestOddNumberString();
        System.out.println(obj.largestOddNumber("52"));
        System.out.println(obj.largestOddNumber("4206"));
        System.out.println(obj.largestOddNumber("35427"));
    }
}