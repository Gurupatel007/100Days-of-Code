# Todays Questions - 9/4/2024

## 1. Intersection of Two Arrays II

### Problem Statement
Given two integer arrays `nums1` and `nums2`, the goal is to return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays, and the result can be returned in any order.

### Examples
- **Input:** `nums1 = [1,2,2,1]`, `nums2 = [2,2]`  
  **Output:** `[2,2]`  
  **Explanation:** Both arrays contain the number `2` twice.

- **Input:** `nums1 = [4,9,5]`, `nums2 = [9,4,9,8,4]`  
  **Output:** `[4,9]` or `[9,4]`  
  **Explanation:** Both arrays contain the numbers `4` and `9`. The order of the result does not matter.

### Constraints
- `1 <= nums1.length, nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 1000`

[Solution & Discussion](intersection.md)

---

## 2. Contains Duplicate II

### Problem Statement
Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

### Examples
- **Input:** `nums = [1,2,3,1]`, `k = 3`  
  **Output:** `true`  
  **Explanation:** `nums[0] == nums[3]` and the absolute difference between the indices is `3`.

- **Input:** `nums = [1,0,1,1]`, `k = 1`  
  **Output:** `true`  
  **Explanation:** `nums[2] == nums[3]` and the absolute difference between the indices is `1`.

- **Input:** `nums = [1,2,3,1,2,3]`, `k = 2`  
  **Output:** `false`  
  **Explanation:** No two such elements exist within the specified range.

### Constraints
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `0 <= k <= 10^5`

[Solution & Discussion](containsDuplicate.md)