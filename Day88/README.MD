# Todays Questions - 8/4/2024

## 1. Minimum Index Sum of Two Lists

### Problem Statement
Given two arrays of strings `list1` and `list2`, the task is to find the common strings with the least index sum. A common string appears in both `list1` and `list2`. The common string with the least index sum is defined such that if it appears at `list1[i]` and `list2[j]`, then `i + j` should be the minimum value among all other common strings. Return all the common strings with the least index sum in any order.

### Examples
- **Input:** `list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]`, `list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]`  
  **Output:** `["Shogun"]`  
  **Explanation:** The only common string is "Shogun".

- **Input:** `list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]`, `list2 = ["KFC", "Shogun", "Burger King"]`  
  **Output:** `["Shogun"]`  
  **Explanation:** The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.

- **Input:** `list1 = ["happy", "sad", "good"]`, `list2 = ["sad", "happy", "good"]`  
  **Output:** `["sad", "happy"]`  
  **Explanation:** The strings "sad" and "happy" have the least index sum of 1.

[Solution & Discussion](MinimumIndex.md)

---

## 2. First Unique Character in a String

### Problem Statement
Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return -1.

### Examples
- **Input:** `s = "leetcode"`  
  **Output:** `0`  
  **Explanation:** The first non-repeating character is 'l' at index 0.

- **Input:** `s = "loveleetcode"`  
  **Output:** `2`  
  **Explanation:** The first non-repeating character is 'v' at index 2.

- **Input:** `s = "aabb"`  
  **Output:** `-1`  
  **Explanation:** There is no non-repeating character, so the output is -1.

[Solution & Discussion](FirstCharacter.md)