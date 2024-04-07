#Contains Duplicate
## Problem Statement
Determine if any integer in a given array `nums` appears at least twice. The function should return `true` if any value appears more than once, and `false` if every element is distinct.

## Example
**Input 1:** `nums = [1,2,3,1]`  
**Output 1:** `true`  
**Explanation 1:** The value `1` appears twice in the array, so the function returns `true`.

**Input 2:** `nums = [1,2,3,4]`  
**Output 2:** `false`  
**Explanation 2:** All elements are distinct, so the function returns `false`.

**Input 3:** `nums = [1,1,1,3,3,4,3,2,4,2]`  
**Output 3:** `true`  
**Explanation 3:** Multiple values like `1`, `3`, and `4` appear more than once, so the function returns `true`.

## Code Walkthrough
The approach utilizes a `HashSet` to keep track of the elements we have seen so far. As we iterate over each element in the array:
- Initially, the `HashSet` is empty.
- When we encounter an element, we check if it's already in the `HashSet`.
  - If it is, we've found a duplicate, and return `true`.
  - If not, we add the element to the `HashSet` and move to the next one.
- This process continues for each element in the array.

### Visualization
For `nums = [1,2,3,1]`:  
- Step 1: `HashSet = {}`, process `1`, `HashSet` becomes `{1}`.  
- Step 2: `HashSet = {1}`, process `2`, `HashSet` becomes `{1, 2}`.  
- Step 3: `HashSet = {1, 2}`, process `3`, `HashSet` becomes `{1, 2, 3}`.  
- Step 4: `HashSet = {1, 2, 3}`, process another `1`, `1` is already in `HashSet`, return `true`.  

If all elements are processed without returning `true`, then there are no duplicates, and we return `false`.

## Implementation
The solution is implemented using a `HashSet` for its properties of unique elements and constant time complexity for add and check operations. Here's a step-by-step algorithm:
1. Initialize an empty `HashSet` to store the unique elements encountered so far.
2. Iterate through each element in the input array `nums`.
   a. For each element, check if it is present in the `HashSet`.
   b. If present, return `true` indicating a duplicate is found.
   c. If not, add the element to the `HashSet`.
3. If the iteration completes without finding any duplicates, return `false`.

## Code
```java
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }
}
```

## Time and Space Complexity
- **Time Complexity:** O(n) - Each element in the array `nums` is processed exactly once. Checking for existence in a `HashSet` and inserting into a `HashSet` both occur in constant time, leading to a linear time complexity overall.
- **Space Complexity:** O(n) - In the worst-case scenario, where all elements are unique, the `HashSet` will store `n` unique elements, leading to a linear space complexity.