# 4Sum II

## Problem Statement

Given four integer arrays `nums1`, `nums2`, `nums3`, and `nums4`, all of length `n`, return the number of tuples `(i, j, k, l)` such that:

- 0 <= i, j, k, l < n
- `nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0`

## Examples

- **Example 1:**
  - Input: `nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]`
  - Output: `2`
  - Explanation: The two tuples are:
    1. (0, 0, 0, 1) -> `nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0`
    2. (1, 1, 0, 0) -> `nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0`

- **Example 2:**
  - Input: `nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]`
  - Output: `1`
  - Explanation: There is only one tuple: (0, 0, 0, 0) -> `nums1[0] + nums2[0] + nums3[0] + nums4[0] = 0`

## Constraints

- `n == nums1.length`
- `n == nums2.length`
- `n == nums3.length`
- `n == nums4.length`
- `1 <= n <= 200`
- `-2^28 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2^28`

## Code Walkthrough

The solution involves using a HashMap to store the sums of pairs from `nums1` and `nums2`, along with their counts. Then, iterate through pairs from `nums3` and `nums4`, and check if the negation of the current sum exists in the HashMap. Increment the count accordingly.

## Implementation

### Code

```java
public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    Map<Integer, Integer> sumCount = new HashMap<>();
    
    // Step 1: Compute all possible sums of pairs from nums1 and nums2 and record their counts
    for (int num1 : nums1) {
        for (int num2 : nums2) {
            int sum = num1 + num2;
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
    }
    
    int count = 0;
    
    // Step 2: For each pair from nums3 and nums4, find if the complement sum exists in map
    for (int num3 : nums3) {
        for (int num4 : nums4) {
            int sum = num3 + num4;
            // Check for the negation of the sum in the first map
            count += sumCount.getOrDefault(-sum, 0);
        }
    }
    
    return count;
}
```

## Time and Space Complexity

- **Time Complexity:** O(N^2), where N is the length of the input arrays. We iterate through all possible pairs from `nums1` and `nums2`, and then through all pairs from `nums3` and `nums4`.
- **Space Complexity:** O(N^2), the space used by the HashMap to store the sums of pairs from `nums1` and `nums2`.