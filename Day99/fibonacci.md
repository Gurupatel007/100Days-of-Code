# Fibonacci Number

## Problem Statement

The Fibonacci numbers form a sequence where each number is the sum of the two preceding ones, starting from 0 and 1. Given an integer `n`, calculate the nth Fibonacci number.

## Examples

- **Example 1:**
  - Input: `n = 2`
  - Output: `1`
  - Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

- **Example 2:**
  - Input: `n = 3`
  - Output: `2`
  - Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

- **Example 3:**
  - Input: `n = 4`
  - Output: `3`
  - Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

## Code Walkthrough

The solution provides a method `fib` to calculate the nth Fibonacci number using recursion.

The `fib` method takes an integer `n` as input and returns the nth Fibonacci number.

The method uses recursion to calculate the Fibonacci number. If `n` is less than 2, it returns `n`; otherwise, it recursively calculates `fib(n-1)` and `fib(n-2)` and returns their sum.

## Implementation

### Description

The `fib` function takes an integer `n` as input and returns the nth Fibonacci number.

The time complexity of the solution is O(2^n), where n is the input number `n`. This is because the function makes two recursive calls for each input value of `n`.

The space complexity is O(n) due to the recursive calls made to the `fib` method, which can reach up to depth `n` in the call stack.

### Code

```java
public int fib(int n) {
    if (n < 2) return n;
    return fib(n - 1) + fib(n - 2);
}
```

## Time and Space Complexity

- **Time Complexity:** O(2^n), where n is the input number `n`.
- **Space Complexity:** O(n), where n is the input number `n`.