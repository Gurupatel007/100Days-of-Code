# Maximum Product Subarray

## Problem Statement

Given an integer array `nums`, find the subarray within `nums` that has the largest product and return that product. The subarray must contain at least one number, and the test cases are designed so that the answer will fit within a 32-bit integer.

## Examples

- **Example 1:**
  - Input: `nums = [2,3,-2,4]`
  - Output: `6`
  - Explanation: The subarray `[2,3]` has the largest product 6.

- **Example 2:**
  - Input: `nums = [-2,0,-1]`
  - Output: `0`
  - Explanation: The result cannot be 2, because the subarray `[-2,-1]` is not considered. The largest product is 0, which is achieved by either choosing subarray `[0]` or any of the negative numbers alone.

## Algorithm

1. **Initialization:** Set `prod1` and `prod2` to the first element of the array, and `result` to `prod1`. These variables represent the maximum product up to the current position, the minimum product up to the current position (to account for the effect of a negative number), and the maximum product found so far, respectively.

2. **Iterate Through the Array:** For each element in the array starting from the second element, perform the following steps:
   
    a. **Calculate Temporary Maximum Product:** Determine the maximum between the current element, the product of the current element and `prod1`, and the product of the current element and `prod2`.
   
    b. **Update Minimum Product (`prod2`):** Determine the minimum between the current element, the product of the current element and `prod1`, and the product of the current element and `prod2`.
   
    c. **Update Maximum Product (`prod1`):** Assign the value from step 2a to `prod1`.
   
    d. **Update Result:** If `prod1` is greater than `result`, update `result` with the value of `prod1`.

3. **Return Result:** After iterating through the array, `result` holds the maximum product of any subarray.

## Solution

```java
public int maxProduct(int[] arr) {
    int prod1 = arr[0], prod2 = arr[0], result = arr[0];
    
    for(int i = 1; i < arr.length; i++) {
        int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
        prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
        prod1 = temp;
        
        result = Math.max(result, prod1);
    }
    
    return result;
}
```

## Example Walkthrough

Consider the array `nums = [2, 3, -2, 4]`.

- Starting with `prod1 = prod2 = result = 2`.
- For `i = 1` (element 3): `temp = max(3, 3*2, 3*2) = 6`, `prod2 = min(3, 3*2, 3*2) = 3`, updating `prod1 = 6`, `result = 6`.
- For `i = 2` (element -2): `temp = max(-2, 6*-2, 3*-2) = 0`, `prod2 = min(-2, 6*-2, 3*-2) = -12`, updating `prod1 = 0`, no change in `result`.
- For `i = 3` (element 4): `temp = max(4, 0*4, -12*4) = 4`, `prod2 = min(4, 0*4, -12*4) = -48`, updating `prod1 = 4`, no change in `result`.

The largest product is 6, as found in the subarray `[2, 3]`.

## Time Complexity

The time complexity of this algorithm is **O(n)**, where `n` is the number of elements in the input array. This is because the algorithm requires a single pass through the array to find the maximum product subarray.

## Space Complexity

The space complexity is **O(1)** since the algorithm uses a fixed amount of space regardless of the input size.
