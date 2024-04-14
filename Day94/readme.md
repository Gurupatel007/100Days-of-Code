# Power of Two

## Problem Statement

Given an integer `n`, return true if it is a power of two. Otherwise, return false.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2^x`.

## Examples

- **Example 1:**
  - Input: `n = 1`
  - Output: `true`
  - Explanation: 2^0 = 1

- **Example 2:**
  - Input: `n = 16`
  - Output: `true`
  - Explanation: 2^4 = 16

- **Example 3:**
  - Input: `n = 3`
  - Output: `false`

## Constraints

- `-2^31 <= n <= 2^31 - 1`

## Code Walkthrough

The solution involves checking if the given number `n` is positive and if `(n & (n - 1)) == 0`. If this condition holds true, it means `n` is a power of two, otherwise not.

## Implementation

### Description

In this implementation, we first check if `n` is less than or equal to zero. If it is, then we return false as numbers less than or equal to zero cannot be powers of two. Then, we check if `(n & (n - 1)) == 0`. If this condition holds true, it means `n` is a power of two, so we return true. Otherwise, we return false.

### Code

```java
public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    return (n & (n - 1)) == 0;
}
```

## Time and Space Complexity

- **Time Complexity:** O(1), as we perform a constant number of operations regardless of the value of `n`.
- **Space Complexity:** O(1), as we are not using any additional data structures that grow with the input size.

---

# Single Number

## Problem Statement

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

## Examples

- **Example 1:**
  - Input: `nums = [2,2,1]`
  - Output: `1`
  - Explanation: The single number is `1`.

- **Example 2:**
  - Input: `nums = [4,1,2,1,2]`
  - Output: `4`
  - Explanation: The single number is `4`.

- **Example 3:**
  - Input: `nums = [1]`
  - Output: `1`
  - Explanation: The single number is `1`.

## Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Each element in the array appears twice except for one element which appears only once.

## Code Walkthrough

The solution involves iterating through the array and performing XOR operation on each element. Since XOR of a number with itself is 0, and XOR of 0 with any number is the number itself, at the end, we will be left with the single number which appears only once.

## Implementation

### Description

In this implementation, we initialize a variable `XOR` to 0. Then, we iterate through the `nums` array and perform XOR operation with each element. Finally, we return the value of `XOR`.

### Code

```java
public int singleNumber(int[] nums) {
    int XOR = 0;
    for (int i = 0; i < nums.length; i++) {
        XOR = XOR ^ nums[i];
    }
    return XOR;
}
```

## Time and Space Complexity

- **Time Complexity:** O(N), where N is the length of the `nums` array. We iterate through each element once.
- **Space Complexity:** O(1), as we use only constant extra space regardless of the input size.