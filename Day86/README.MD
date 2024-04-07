# Questions - 6/4/2024

## 1. Contains Duplicate

### Problem Statement
Determine if any integer in a given array `nums` appears at least twice. The function should return `true` if any value appears more than once, and `false` if every element is distinct.

### Examples
- **Input:** `nums = [1,2,3,1]`  
  **Output:** `true`  
  **Explanation:** The value `1` appears twice in the array, so the function returns `true`.

- **Input:** `nums = [1,2,3,4]`  
  **Output:** `false`  
  **Explanation:** All elements are distinct, so the function returns `false`.

- **Input:** `nums = [1,1,1,3,3,4,3,2,4,2]`  
  **Output:** `true`  
  **Explanation:** Multiple values like `1`, `3`, and `4` appear more than once, so the function returns `true`.

[Solution & Discussion](containsDuplicate.md)

---

## 2. Intersection of Two Arrays

### Problem Statement
Given two integer arrays `nums1` and `nums2`, the objective is to find the intersection of these two arrays. The intersection includes all the unique elements present in both arrays. The result can be returned in any order.

### Examples
- **Input:** `nums1 = [1,2,2,1]`, `nums2 = [2,2]`  
  **Output:** `[2]`  
  **Explanation:** Both arrays contain the number `2`. Despite `2` appearing more than once in both arrays, it should be included only once in the output.

- **Input:** `nums1 = [4,9,5]`, `nums2 = [9,4,9,8,4]`  
  **Output:** `[9,4]` or `[4,9]`  
  **Explanation:** Both arrays contain the numbers `4` and `9`. The order of the result does not matter.

[Solution & Discussion](intersectionOfTwoArray.md)

---

## 3. Single Number

### Problem Statement
In a given array `nums` of integers where every element appears twice except for one, the challenge is to find that single element. The catch is to design a solution that operates in linear time complexity and employs only constant extra space.

### Examples
- **Input:** `nums = [2,2,1]`  
  **Output:** `1`  
  **Explanation:** Each number appears twice except for `1`, which appears once.

- **Input:** `nums = [4,1,2,1,2]`  
  **Output:** `4`  
  **Explanation:** Here, `4` is the unique number appearing only once.

- **Input:** `nums = [1]`  
  **Output:** `1`  
  **Explanation:** With only one element, `1` is the unique element.

[Solution & Discussion](singleNumber.md)
