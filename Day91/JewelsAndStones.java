import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }
        
        for(int i=0;i<stones.length();i++){
            char currEle = stones.charAt(i);
            if(set.contains(currEle)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        JewelsAndStones obj = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
}
