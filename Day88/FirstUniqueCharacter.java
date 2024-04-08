import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        System.out.println(fuc.firstUniqChar("leetcode")); // 0
        System.out.println(fuc.firstUniqChar("loveleetcode")); // 2
        System.out.println(fuc.firstUniqChar("aabb")); // -1
    }
}
