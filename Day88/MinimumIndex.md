# Minimum Index Sum of Two Lists

## Problem Statement
Given two arrays of strings, `list1` and `list2`, the task is to find the common strings with the least index sum. If a string appears at `list1[i]` and `list2[j]`, then the index sum is `i + j`. The goal is to return all common strings with the least index sum, in any order.

## Examples
- **Example 1:**
  - **Input:** `list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]`, `list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]`
  - **Output:** `["Shogun"]`
  - **Explanation:** The only common string is "Shogun".

- **Example 2:**
  - **Input:** `list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]`, `list2 = ["KFC", "Shogun", "Burger King"]`
  - **Output:** `["Shogun"]`
  - **Explanation:** The least index sum for "Shogun" is 1 (index 0 in list1 + index 1 in list2).

- **Example 3:**
  - **Input:** `list1 = ["happy", "sad", "good"]`, `list2 = ["sad", "happy", "good"]`
  - **Output:** `["sad", "happy"]`
  - **Explanation:** Both "sad" and "happy" have the least index sum of 1.

## Code Walkthrough
1. **Initialize a HashMap** to store the strings from `list1` and their indices for quick look-up.
2. **Initialize a variable `minSum`** to track the minimum index sum encountered.
3. **Iterate through `list2`**, checking for each string if it exists in the HashMap.
   - If a match is found, calculate the index sum (`i + hashmap.get(list2[i])`).
   - **If this sum is less than `minSum`,** update `minSum` and start a new list of strings with this minimum sum.
   - **If the sum equals `minSum`,** simply add the string to the list of results.
4. Convert the list of strings with the least index sum to an array and return it.

## Visualization
Consider the arrays `list1 = ["Shogun", "Tapioca Express"]` and `list2 = ["Tapioca Express", "Shogun"]`.

- After mapping `list1`, the HashMap contains `{"Shogun" -> 0, "Tapioca Express" -> 1}`.
- Iterating through `list2`, "Tapioca Express" is found with an index sum of 1 (`1 + 0`), setting `minSum` to 1. Then, "Shogun" is found with the same index sum of 1 (`0 + 1`), so it's also added to the result list.

## Implementation

In the implementation below, a HashMap is utilized to store elements from the first list (`list1`) along with their indices for quick lookups. This helps in efficiently checking if elements from the second list (`list2`) exist in the first list and calculating their index sums. The core idea is to find common elements with the least index sum. If a common element with a smaller index sum is found, the list of results is cleared and updated with this new element. If the index sum is equal to the current minimum, the element is added to the list. Finally, the list of strings is converted to an array and returned.

### Code
```java
public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String, Integer> hashmap = new HashMap<>();
    int minSum = Integer.MAX_VALUE;
    List<String> res = new ArrayList<>();
    
    // Store elements of list1 in a hashmap with their indices
    for (int i = 0; i < list1.length; i++) {
        hashmap.put(list1[i], i);
    }
    
    // Iterate through list2 and check if the element exists in list1
    for (int i = 0; i < list2.length; i++) {
        if (hashmap.containsKey(list2[i])) {
            int indexSum = i + hashmap.get(list2[i]); // Calculate the index sum
            if (indexSum < minSum) {
                // Found a new minimum index sum, update minSum and clear previous results
                res.clear();
                minSum = indexSum;
                res.add(list2[i]);
            } else if (indexSum == minSum) {
                // If index sum is equal to the current minSum, add the element to the results
                res.add(list2[i]);
            }
        }
    }
    
    // Convert the list to an array and return
    return res.toArray(new String[0]);
}
```

## Time and Space Complexity
- **Time Complexity:** `O(N + M)`, where `N` is the length of `list1` and `M` is the length of `list2`. This complexity arises from iterating through both lists once.
- **Space Complexity:** `O(N)`, where `N` is the length of `list1`. This space is taken by the HashMap used for storing the strings and their indices from `list1`. The space required for the result list does not significantly affect the overall space complexity since it stores references to strings already present in the input lists.