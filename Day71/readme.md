# Sqrt(x)

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. The returned integer should be non-negative as well. You must not use any built-in exponent function or operator, for example, `pow(x, 0.5)` in C++ or `x ** 0.5` in Python.

## Approach: Binary Search
To solve this problem, we implement a binary search because the square root of `x` will be in the range `[1, x]`. This method efficiently narrows down the search range to find the square root or the nearest floor value of the square root.

### Algorithm
1. If `x` is 0, return 0 since the square root of 0 is 0.
2. Set `left` to 1 and `right` to `x`, to define the search range.
3. While `left` is less than or equal to `right`, perform the following steps:
   - Calculate `mid` as the average of `left` and `right` (avoiding integer overflow).
   - Compute `square` as `mid * mid`.
   - If `square` is greater than `x`, adjust the `right` boundary to `mid - 1`.
   - If `square` is less than `x`, adjust the `left` boundary to `mid + 1` and update `res` to `mid`.
   - If `square` equals `x`, `mid` is the exact square root, and we can return `mid`.
4. If the loop ends without finding an exact square root, return `res`, which represents the floor value of the square root of `x`.

### Code

```java
public int mySqrt(int x) {
    if(x == 0) return 0;
    int left = 1;
    int right = x;
    int res = 0;
    while(left <= right){
        int mid = left + (right - left) / 2;
        long square = (long) mid * mid;
        if(square > x){
            right = mid - 1;
        } else if(square < x){
            left = mid + 1;
            res = mid;
        } else return mid;
    }
    return res;
}
```

# Step-by-Step Visualization for Sqrt(x)

Consider the input `x = 8`.

- **Initialization**: `left = 1`, `right = 8`.

- **Iteration 1**: 
  - `mid = 4`, 
  - `square = 16` (`16 > 8`), 
  - So, adjust `right` to `3`.

- **Iteration 2**: 
  - `mid = 2`, 
  - `square = 4` (`4 < 8`), 
  - So, update `left` to `3`, `res` becomes `2`.

- **Iteration 3**: 
  - `mid = 3`, 
  - `square = 9` (`9 > 8`), 
  - Adjust `right` to `2`.

The loop ends since `left` is no longer `<=` `right`. The value of `res` is `2`, which is the largest integer square root of `8` that does not exceed `8`.

## Complexity Analysis

- **Time Complexity**: O(log x), due to the binary search approach.
- **Space Complexity**: O(1), as the algorithm uses a constant amount of space.
