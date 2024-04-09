package Day89;

import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfArray2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int currEle = nums1[i];
            hashmap.put(currEle, hashmap.getOrDefault(currEle, 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int currEle = nums2[i];
            if (hashmap.containsKey(currEle) && (hashmap.get(currEle) > 0)) {
                ls.add(currEle);
                int value = hashmap.get(currEle);
                hashmap.put(currEle, value - 1);
            }
        }

        int[] ans = new int[ls.size()];

        int i = 0;
        for (int n : ls) {
            ans[i++] = n;
        }

        return ans;
    }

    public static void main(String[] args) {
        intersectionOfArray2 obj = new intersectionOfArray2();

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        int[] ans = obj.intersect(nums1, nums2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
