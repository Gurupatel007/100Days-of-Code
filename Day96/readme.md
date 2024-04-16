## Binary Search

**Problem Statement:**

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

**Examples:**

- **Example 1:**
  - Input: `nums = [-1,0,3,5,9,12]`, `target = 9`
  - Output: `4`
  - Explanation: 9 exists in `nums` and its index is 4.
  
- **Example 2:**
  - Input: `nums = [-1,0,3,5,9,12]`, `target = 2`
  - Output: `-1`
  - Explanation: 2 does not exist in `nums` so return -1.

**Constraints:**

- `1 <= nums.length <= 10^4`
- `-10^4 < nums[i], target < 10^4`
- All the integers in `nums` are unique.
- `nums` is sorted in ascending order.

[Link to the solution](BinarySearch.md)

---

## Fibonacci Series

**Problem Statement:**

The Fibonacci series is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Write a function to find the nth number in the Fibonacci series.

**Examples:**

- **Example:**
  - Input: `n = 6`
  - Output: `8`
  - Explanation: The 6th number in the Fibonacci series is 8. The series starts from 0, 1, 1, 2, 3, 5, 8, ...

**Constraints:**

- None provided.

[Link to the solution](Fibonacci.md)

---

## Reverse String

**Problem Statement:**

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with O(1) extra memory.

**Examples:**

- **Example 1:**
  - Input: `s = ["h","e","l","l","o"]`
  - Output: `["o","l","l","e","h"]`

- **Example 2:**
  - Input: `s = ["H","a","n","n","a","h"]`
  - Output: `["h","a","n","n","a","H"]`

**Constraints:**

- `1 <= s.length <= 10^5`
- `s[i]` is a printable ASCII character.

[Link to the solution](ReverseString.md)