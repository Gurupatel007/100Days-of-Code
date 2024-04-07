## Single Number

### Problem Statement
In a given array `nums` of integers where every element appears twice except for one, the challenge is to find that single element. The catch is to design a solution that operates in linear time complexity and employs only constant extra space.

### Example
- **Input 1:** `nums = [2,2,1]`  
  **Output 1:** `1`  
  Each number appears twice except for `1`, which appears once.

- **Input 2:** `nums = [4,1,2,1,2]`  
  **Output 2:** `4`  
  Here, `4` is the unique number appearing only once.

- **Input 3:** `nums = [1]`  
  **Output 3:** `1`  
  With only one element, `1` is the unique element.

### Code Walkthrough
Let's analyze the given solution, which uses a `HashSet` to find the single number:

1. **Initial Check**: If the array contains only one element, return that element immediately, as it's the unique number.
   
2. **HashSet Creation**: A `HashSet<Integer>` named `set` is initialized to keep track of the numbers encountered.

3. **Iterating Through `nums`**:
   - For each `num` in `nums`, try adding it to `set`.
   - If `add(num)` returns `false`, it indicates `num` is already in the set, implying we've encountered a duplicate. Consequently, `num` is removed from `set`.

4. **Finding the Unique Number**: After iterating through all numbers, `set` will contain exactly one element, the unique number. We retrieve and return this number using `set.iterator().next()`.

### Visualization
Consider `nums = [4,1,2,1,2]`:
- Initially, `set` is empty.
- Iterating through `nums`:
  - Add `4` to `set`. Now, `set = {4}`.
  - Add `1` to `set`. Now, `set = {4, 1}`.
  - Add `2` to `set`. Now, `set = {4, 1, 2}`.
  - Encounter `1` again, it's removed from `set`. Now, `set = {4, 2}`.
  - Encounter `2` again, it's removed from `set`. Now, `set = {4}`.
- `set` now contains the unique number `4`.

### Implementation
The provided solution utilizes a `HashSet` to track encountered numbers, adding a number if it's not in the set, or removing it if it already exists. This process effectively isolates the unique number.

### Provided Code
```java
public int singleNumber(int[] nums) {
    if(nums.length == 1) return nums[0];
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        if(!set.add(num)){
            set.remove(num);
        }
    }
    return set.iterator().next();
}
```

### Time and Space Complexity
- **Time Complexity:** O(n) - The solution iterates through all elements of the array once, where `n` is the number of elements in `nums`.
- **Space Complexity:** O(n) - In the worst-case scenario, the `HashSet` might need to store up to `(n-1)/2` elements when the unique element is at the end of the array. This doesn't meet the problem's requirement for constant space, but it's the analysis for the given solution.