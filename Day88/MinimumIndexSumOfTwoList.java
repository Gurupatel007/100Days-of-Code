import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoList {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        int minSum = Integer.MAX_VALUE;
        List<String> str = new ArrayList<>();
        
        for(int i =0;i<list1.length;i++){
            hashmap.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(hashmap.containsKey(list2[i])) {
                int indexSum = i + hashmap.get(list2[i]);
                // When finding a new minimum sum, clear the previous list and update minSum
                if(indexSum < minSum) {
                    str.clear(); // Clear the list to start fresh as we found a smaller sum
                    minSum = indexSum;
                    str.add(list2[i]);
                } else if (indexSum == minSum) {
                    // If the current sum is equal to the minimum sum, just add the restaurant to the list
                    str.add(list2[i]);
                }
            }
        }
        
        String[] ans = new String[str.size()];
        int i=0;
        for(String st:str){
            ans[i++] = st;
        }
        return ans;
    }
    public static void main(String[] args) {
        MinimumIndexSumOfTwoList m = new MinimumIndexSumOfTwoList();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] ans = m.findRestaurant(list1, list2);
        for(String s:ans){
            System.out.println(s);
        }
    }
}