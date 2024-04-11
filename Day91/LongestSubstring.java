import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max  = 0;
        int i=0;
        int j=0;
        
        while(j<s.length()){
            char currEle = s.charAt(j);
            
            if(!set.contains(currEle)){
                set.add(currEle);
                j++;
                max = Math.max(max,j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));   
    }
}