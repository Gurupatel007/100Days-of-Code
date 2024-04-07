package Day87;

import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> StoT = new HashMap<>();
        HashMap<Character,Character> TtoS = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(StoT.containsKey(sChar) && StoT.get(sChar) != tChar){
                return false;
            }
            
            if(TtoS.containsKey(tChar) && TtoS.get(tChar) != sChar){
                return false;
            }
            
            StoT.put(sChar,tChar);
            TtoS.put(tChar,sChar);
        }
        return true;
    }
    public static void main(String[] args) {
        isomorphicStrings obj = new isomorphicStrings();
        String str1 = "paper";
        String str2 = "title";
        System.out.println(obj.isIsomorphic(str1, str2));
    }
}
