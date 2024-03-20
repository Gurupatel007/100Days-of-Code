# Palindrome String

## Problem Statement
Given a string `S`, check if it is a palindrome or not.

### Examples

- **Example 1:**
  - Input: `S = "abba"`
  - Output: `1`
  - Explanation: `S` is a palindrome.

- **Example 2:**
  - Input: `S = "abc"`
  - Output: `0`
  - Explanation: `S` is not a palindrome.

## Approach
The idea is to use two pointers, one at the start and the other at the end of the string. We compare the characters at these pointers and move them towards the center. If at any point the characters at these pointers do not match, the string is not a palindrome.

### Algorithm
1. Initialize two pointers, `start` at 0 and `end` at the length of the string minus one.
2. While `start` is less than or equal to `end`:
   - If the characters at `start` and `end` are the same, increment `start` and decrement `end`.
   - Otherwise, return `0`.
3. If all characters match, return `1`.

### Code

```java
int isPalindrome(String S) {
    int n = S.length();
    int start = 0;
    int end = n - 1;

    while (start <= end) {
        if (S.charAt(start) == S.charAt(end)) {
            start++;
            end--;
        } else {
            return 0;
        }
    }
    return 1;
}
```

### Minimum Difference Between Highest and Lowest of K Scores

<!-- ```markdown
# Minimum Difference Between Highest and Lowest of K Scores -->

## Problem Statement
You are given a 0-indexed integer array `nums`, where `nums[i]` represents the score of the `i`th student. You are also given an integer `k`. Pick the scores of any `k` students from the array so that the difference between the highest and lowest of the `k` scores is minimized. Return the minimum possible difference.

### Examples

- **Example 1:**
  - Input: `nums = [90], k = 1`
  - Output: `0`
  - Explanation: The difference between the highest and lowest score is `90 - 90 = 0`. The minimum possible difference is `0`.

- **Example 2:**
  - Input: `nums = [9,4,1,7], k = 2`
  - Output: `2`
  - Explanation: The minimum possible difference is `2`.

## Approach
To find the minimum difference between the highest and lowest of `k` scores, we can sort the array and then find the minimum difference between the `k` consecutive elements in the sorted array.

### Algorithm
1. Sort the array `nums`.
2. Initialize two pointers, `left` at 0 and `right` at `k-1`.
3. Initialize a variable `res` to store the minimum difference, set it to `Integer.MAX_VALUE`.
4. While `right` is less than the length of `nums`:
   - Update `res` to be the minimum between `res` and `nums[right] - nums[left]`.
   - Increment both `left` and `right`.
5. Return `res`.

### Code

```java
public int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length;
    int left = 0, right = k - 1;
    int res = Integer.MAX_VALUE;
    
    while (right < n) {
        res = Math.min(res, nums[right] - nums[left]);
        left++;
        right++;
    }
    return res;
}
```
