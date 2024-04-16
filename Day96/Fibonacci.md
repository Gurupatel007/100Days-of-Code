# Fibonacci Series

## Problem Statement

The Fibonacci series is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Write a function to find the nth number in the Fibonacci series.

## Examples

- **Example:**
  - Input: `n = 6`
  - Output: `8`
  - Explanation: The 6th number in the Fibonacci series is 8. The series starts from 0, 1, 1, 2, 3, 5, 8, ...

## Code Walkthrough

The solution provides a method to find the nth number in the Fibonacci series:
1. **Recursive Approach:** The `printFibo` method uses recursion to calculate the Fibonacci number. It checks if the input `n` is less than 2, in which case it returns `n`. Otherwise, it recursively calculates the Fibonacci number by summing the results of `printFibo(n-1)` and `printFibo(n-2)`.

## Implementation

### Description

The `main` method demonstrates how to use the `printFibo` function to find the nth Fibonacci number. It takes an integer `n` as input and prints the result obtained from `printFibo(n)`.

### Code

```java
public static void main(String[] args) {
    int n = 6;
    int ans = printFibo(n);
    System.out.println(ans);
}

static int printFibo(int n) {
    if (n < 2) {
        return n;
    }
    return printFibo(n - 1) + printFibo(n - 2);
}
```

## Time and Space Complexity

- **Time Complexity:** O(2^n), where n is the input number `n`. The time complexity arises from the recursive calls.
- **Space Complexity:** O(n), where n is the recursion depth. The function call stack can grow up to O(n) due to recursion.