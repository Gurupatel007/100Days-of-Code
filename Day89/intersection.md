# Intersection of Two Arrays II

## Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.

## Examples

- **Example 1:**
  - Input: `nums1 = [1,2,2,1], nums2 = [2,2]`
  - Output: `[2,2]`
  - Explanation: Both arrays have the number 2 twice, so the result is `[2,2]`.

- **Example 2:**
  - Input: `nums1 = [4,9,5], nums2 = [9,4,9,8,4]`
  - Output: `[4,9]`
  - Explanation: The numbers 4 and 9 appear in both arrays. `[9,4]` is also accepted.

## Constraints

- `1 <= nums1.length, nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 1000`

## Code Walkthrough

The solution employs a `HashMap` to track the occurrences of elements from the first array (`nums1`). It then iterates over the second array (`nums2`), checking if an element exists in the map and has a non-zero value, indicating a match. Matches are added to a list, and the count in the map is decremented to ensure the correct number of occurrences.

## Visualization

For `nums1 = [4,9,5]` and `nums2 = [9,4,9,8,4]`:
- The `hashmap` after processing `nums1` would be `{4:1, 9:1, 5:1}`.
- Iterating through `nums2`, we find 9 and 4, which exist in the map with non-zero values, so we add them to the list.
- The resulting list is `[4,9]`, which when converted to an array gives `[4,9]`.

## Implementation

This approach utilizes a `HashMap` to keep track of the counts of each element in `nums1`. As we iterate through `nums2`, we check for matches in the map and manage counts to ensure elements are included in the result based on their occurrence in both arrays.

### Code

```java
public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    ArrayList<Integer> ls = new ArrayList<>();
    
    // Count occurrences of each element in nums1
    for (int num : nums1) {
        hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
    }
    
    // Find intersections with nums2 and update counts
    for (int num : nums2) {
        if (hashmap.containsKey(num) && hashmap.get(num) > 0) {
            ls.add(num);
            hashmap.put(num, hashmap.get(num) - 1);
        }
    }
    
    // Convert list to array
    int[] ans = new int[ls.size()];
    for (int i = 0; i < ls.size(); i++) {
        ans[i] = ls.get(i);
    }
    
    return ans;
}
```

## Time and Space Complexity

- **Time Complexity:** O(n + m) - The algorithm iterates over both arrays once, where `n` is the length of `nums1` and `m` is the length of `nums2`.
- **Space Complexity:** O(min(n, m)) - In the worst case, the `HashMap` stores elements from the smaller of the two arrays.