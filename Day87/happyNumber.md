## Happy Number

### Problem Statement
The task is to determine if a number `n` is a happy number. A happy number is defined by a process where starting with any positive integer, you replace the number by the sum of the squares of its digits. This process is repeated until the number equals 1 (indicating the number is happy), or it loops endlessly in a cycle that does not include 1 (indicating the number is not happy).

### Example
- **Input 1:** `n = 19`  
  **Output 1:** `true`  
  **Explanation:**  
  1^2 + 9^2 = 82  
  8^2 + 2^2 = 68  
  6^2 + 8^2 = 100  
  1^2 + 0^2 + 0^2 = 1. Since the process ends in 1, 19 is a happy number.
  
- **Input 2:** `n = 2`  
  **Output 2:** `false`  
  The sequence initiated by 2 does not end in 1, indicating 2 is not a happy number.

### Code Walkthrough
The given solution uses a `HashSet` to track all previously seen numbers in the sequence to detect cycles:

1. **Initialization**: Start with `temp = n`. A `HashSet<Integer> seen` is used to track numbers that have been seen in the process.

2. **Loop Until Happy or Cycle Detected**:
   - Continuously update `temp` with the sum of the squares of its digits by calling `sumOfSquares(temp)`.
   - If `temp` equals 1, the process terminates, and `n` is a happy number.
   - If `temp` has been seen before (i.e., `seen.add(temp)` returns `false`), a cycle is detected, and `n` is not a happy number.

3. **Sum of Squares Calculation**: `sumOfSquares(int temp)` calculates the sum of the squares of the digits of `temp`.

### Visualization for Input 1: `n = 19`
- Start with `temp = 19`, `seen = {}`.
- Calculate sum of squares: `1^2 + 9^2 = 82`, now `temp = 82`, `seen = {19}`.
- Calculate sum of squares: `8^2 + 2^2 = 68`, now `temp = 68`, `seen = {19, 82}`.
- Continue this process until `temp = 1`, sequence observed: `19 -> 82 -> 68 -> 100 -> 1`.
- Since `temp` becomes `1`, the loop ends. `19` is a happy number.

### Implementation
The algorithm checks if a given number `n` is happy by iteratively replacing it with the sum of the squares of its digits, using a `HashSet` to detect cycles.

### Provided Code
```java
public boolean isHappy(int n) {
    int temp = n;
    HashSet<Integer> seen = new HashSet<>();
    
    while(temp != 1) {
        if(!seen.add(temp)) {
            return false;
        }           
        temp = sumOfSquares(temp);
    }
    return true;
}

private int sumOfSquares(int temp) {
    int sum = 0;
    while(temp > 0) {
        int rem = temp % 10;
        sum += rem * rem;
        temp /= 10;
    }
    return sum;
}
```

### Time and Space Complexity
- **Time Complexity:** O(log n) for most cases, but the analysis can be complex due to the mathematical operations involved and the potential for varied lengths of cycles.
- **Space Complexity:** O(log n) since the `HashSet` can grow based on the number of unique transformations encountered before either reaching 1 or entering a cycle.