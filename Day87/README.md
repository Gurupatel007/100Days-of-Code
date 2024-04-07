# Coding Challenges: Numbers and Strings

This document provides problem statements for three coding challenges focusing on numbers and strings. Each problem tests a unique concept ranging from mathematical calculations to pattern recognition in strings.

---

## 1. Happy Number

### Problem Statement
The task is to determine if a number `n` is a happy number. A happy number is defined by a process where starting with any positive integer, you replace the number by the sum of the squares of its digits. This process is repeated until the number equals 1 (indicating the number is happy), or it loops endlessly in a cycle that does not include 1 (indicating the number is not happy).

### Examples
- **Input:** `n = 19`  
  **Output:** `true`  
  **Explanation:**  
  1^2 + 9^2 = 82  
  8^2 + 2^2 = 68  
  6^2 + 8^2 = 100  
  1^2 + 0^2 + 0^2 = 1. Since the process ends in 1, 19 is a happy number.
  
- **Input:** `n = 2`  
  **Output:** `false`  
  **Explanation:** The sequence initiated by 2 does not end in 1, indicating 2 is not a happy number.

[Solution & Discussion](happyNumber.md)

---

## 2. Isomorphic Strings

### Problem Statement
Determine if two strings, `s` and `t`, are isomorphic. Two strings are considered isomorphic if the characters in `s` can be replaced to get `t`. Every occurrence of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

### Examples
- **Input:** `s = "egg"`, `t = "add"`  
  **Output:** `true`  
  **Explanation:** Each character from `s` can be replaced to get `t`.

- **Input:** `s = "foo"`, `t = "bar"`  
  **Output:** `false`  
  **Explanation:** Characters in `s` and `t` do not map consistently to each other.

- **Input:** `s = "paper"`, `t = "title"`  
  **Output:** `true`  
  **Explanation:** Each character from `s` maps to a corresponding character in `t` in a one-to-one mapping.

[Solution & Discussion](isomorphicStrings.md)

---

## 3. Two Sum

### Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`. It's guaranteed that each input has exactly one solution, and the same element cannot be used twice. The answer can be returned in any order.

### Examples
- **Input:** `nums = [2,7,11,15]`, `target = 9`  
  **Output:** `[0,1]`  
  **Explanation:** `nums[0] + nums[1] == 9`, thus we return `[0, 1]`.

- **Input:** `nums = [3,2,4]`, `target = 6`  
  **Output:** `[1,2]`  
  **Explanation:** `nums[1] + nums[2] == 6`, thus we return `[1, 2]`.

- **Input:** `nums = [3,3]`, `target = 6`  
  **Output:** `[0,1]`  
  **Explanation:** `nums[0] + nums[1] == 6`, thus we return `[0, 1]`.

[Solution & Discussion](twoSum.md)