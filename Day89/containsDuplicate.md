# Contains Duplicate II

## Problem Statement

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

## Examples

- **Example 1:**
  - Input: `nums = [1,2,3,1], k = 3`
  - Output: `true`
  - Explanation: `nums[0] == nums[3]` and the absolute difference of the indices is `3 - 0 = 3`, which is less than or equal to `k`.

- **Example 2:**
  - Input: `nums = [1,0,1,1], k = 1`
  - Output: `true`
  - Explanation: `nums[2] == nums[3]` and the absolute difference of the indices is `3 - 2 = 1`, which is less than or equal to `k`.

- **Example 3:**
  - Input: `nums = [1,2,3,1,2,3], k = 2`
  - Output: `false`
  - Explanation: There are no two distinct indices `i` and `j` that satisfy the conditions.

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `0 <= k <= 10^5`

## Code Walkthrough

This solution uses a `HashMap` to track the indices of elements as they are encountered. For each element, it checks if the same element has been seen before and if the difference between the current and previous indices is less than or equal to `k`. This efficiently checks for duplicates within the specified range.

## Visualization

Imagine iterating over `nums = [1,2,3,1]` with `k = 3`:
- At index `0`, `hashmap = {1:0}`.
- At index `3`, we find another `1`. The difference between indices `3` and `0` is `3`, which is equal to `k`. We return `true`.

## Implementation

### Code

```java
public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int currEle = nums[i]; // current element
        
        if (hashmap.containsKey(currEle) && (Math.abs(hashmap.get(currEle) - i) <= k)) {
            return true; // Found a duplicate within the range k
        }
        hashmap.put(currEle, i); // Update the latest index of the current element
    }
    return false;
}
```

## Time and Space Complexity

- **Time Complexity:** O(n) - The algorithm iterates through the array once, where `n` is the length of `nums`.
- **Space Complexity:** O(n) - In the worst case, the `HashMap` may store up to `n` unique elements if no duplicates are found within the range `k`.