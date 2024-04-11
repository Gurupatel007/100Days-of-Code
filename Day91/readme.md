# Todays Question - 10/5/2024

## Jewels and Stones

**Problem Statement:**

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

**Example:**

```plaintext
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Input: jewels = "z", stones = "ZZ"
Output: 0
```

**Constraints:**

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique

[Link to the solution](jewels.md)

---

## Longest Substring Without Repeating Characters

**Problem Statement:**

Given a string `s`, find the length of the longest substring without repeating characters.

**Example:**

```plaintext
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Constraints:**

- 0 <= s.length <= 5 * 10^4
- s consists of English letters, digits, symbols, and spaces.

[Link to the solution](longestSubstring.md)