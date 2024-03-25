# Arranging Coins

## Problem Statement

You have `n` coins and you want to build a staircase with these coins. The staircase consists of `k` rows where the `ith` row has exactly `i` coins. The last row of the staircase may be incomplete. Given the integer `n`, return the number of complete rows of the staircase you will build.

### Examples

- **Example 1:**
    - Input: `n = 5`
    - Output: `2`
    - Explanation: Because the 3rd row is incomplete, we return 2.

- **Example 2:**
    - Input: `n = 8`
    - Output: `3`
    - Explanation: Because the 4th row is incomplete, we return 3.

## Approach

To solve this problem, we use a binary search to find the maximum number of complete rows (`k`) that can be formed with `n` coins.

1. Initialize two pointers, `left = 0` and `right = n`, to cover the potential range of the solution.
2. While `left` is less than or equal to `right`, perform the following steps:
   - Calculate the middle value `mid`, which represents a guess of how many complete rows can be formed.
   - Calculate the total number of coins needed to form `mid` rows, which is `mid * (mid + 1) / 2`.
   - If this total number of coins exactly matches `n`, then `mid` is the answer.
   - If the total is less than `n`, it means we can potentially form more complete rows, so move `left` to `mid + 1`.
   - If the total is more than `n`, it means we cannot form `mid` complete rows, so move `right` to `mid - 1`.
3. After exiting the loop, `right` will hold the maximum number of complete rows that can be formed.

### Code

```java
public int arrangeCoins(int n) {
    long left = 0, right = n;
    long mid, currSum;
    
    while (left <= right) {
        mid = left + (right - left) / 2;
        currSum = mid * (mid + 1) / 2;
        
        if (currSum == n) {
            return (int) mid;
        } else if (currSum < n) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return (int) right;
}
```

## Complexity Analysis

- **Time Complexity:** O(log n), where `n` is the total number of coins. The binary search reduces the search space in half with each iteration.
- **Space Complexity:** O(1), as the solution only uses a constant amount of extra space.