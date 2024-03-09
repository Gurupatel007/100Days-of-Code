public class Find_The_Diff {
    public static char findTheDifference(String s, String t) {
        char ch = 0;
        
        // XOR all characters in string s
        for (int i = 0; i < s.length(); i++) {
            ch ^= s.charAt(i);
        }
        
        // XOR all characters in string t
        for (int i = 0; i < t.length(); i++) {
            ch ^= t.charAt(i);
        }
        
        // The result will be the added character
        return ch;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}