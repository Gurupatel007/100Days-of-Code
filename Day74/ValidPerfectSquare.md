# Valid Perfect Square

## Problem Statement

Given a positive integer `num`, determine if it is a perfect square. A perfect square is an integer that can be expressed as the product of some integer with itself. You are not allowed to use any built-in library function that directly calculates the square root.

### Examples

- **Example 1:**
    - Input: `num = 16`
    - Output: `true`
    - Explanation: Since 4 * 4 = 16 and 4 is an integer, we return `true`.

- **Example 2:**
    - Input: `num = 14`
    - Output: `false`
    - Explanation: Since there's no integer whose square is 14, we return `false`.

## Approach

The approach to solving this problem involves performing a binary search over the range of integers from 1 to `num` to find an integer that, when squared, equals `num`.

1. Initialize `low` as 1 and `high` as `num`.
2. While `low` is less than or equal to `high`, perform the following steps:
    - Calculate the middle point `mid`.
    - Compute the square of `mid`.
    - If the square equals `num`, return `true` indicating `num` is a perfect square.
    - If the square is less than `num`, move the `low` pointer up to narrow the search range.
    - If the square is greater than `num`, move the `high` pointer down to narrow the search range.
3. If no square is found that equals `num`, return `false`.

### Code

```java
public boolean isPerfectSquare(int num) {
    if(num == 1) return true;
    long low = 1;
    long high = num;
    while(low <= high){
        long mid = low + (high - low) / 2;
        long square = mid * mid;
        if(square == num) return true;
        else if(square < num) low = mid + 1;
        else high = mid - 1;
    }
    return false;
}
```

## Complexity Analysis

- **Time Complexity:** O(log n), where `n` is the value of `num`. The binary search cuts the search space in half each iteration.
- **Space Complexity:** O(1), as the solution uses a constant amount of space.