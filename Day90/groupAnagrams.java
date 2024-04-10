import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map sorted strings to lists of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            String sorted = sortString(s); // Sort the string to use as a key
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s); // Add the original string to the correct list
        }
        
        // Convert the map values to a list of lists
        return new ArrayList<>(map.values());
    }
    private static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
    public static void main(String[] args) {
        groupAnagrams obj = new groupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs)); // Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
    }
}