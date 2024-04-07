## Two Sum

### Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`. It's guaranteed that each input has exactly one solution, and the same element cannot be used twice. The answer can be returned in any order.

### Example
- **Input 1:** `nums = [2,7,11,15]`, `target = 9`  
  **Output 1:** `[0,1]`  
  Explanation: `nums[0] + nums[1] == 9`, thus we return `[0, 1]`.

- **Input 2:** `nums = [3,2,4]`, `target = 6`  
  **Output 2:** `[1,2]`  
  Explanation: `nums[1] + nums[2] == 6`, thus we return `[1, 2]`.

- **Input 3:** `nums = [3,3]`, `target = 6`  
  **Output 3:** `[0,1]`  
  Explanation: `nums[0] + nums[1] == 6`, thus we return `[0, 1]`.

### Code Walkthrough
1. **HashMap Storage**: A HashMap `map` is created to store elements of the array as keys and their indices as values.
2. **Iterate Through `nums`**: For each element in `nums`, calculate `remaining = target - currentElement`.
3. **Check for Solution**:
   - If `remaining` is found in `map`, it means a pair has been identified that adds up to `target`. Return the indices of the current element and the element that corresponds to `remaining`.
   - If not found, add the current element and its index to `map`.
4. **No Solution**: If no pair is found that adds up to the target (which contradicts the problem statement, but is good practice for error handling), return `[-1, -1]`.

### Visualization
Consider `nums = [2, 7, 11, 15]`, `target = 9`
- Iteration 1: `currEle = 2`, `remaining = 7`. `map` is empty, so `2` is added to `map` with index `0`.
- Iteration 2: `currEle = 7`, `remaining = 2`. `2` is found in `map`, meaning `nums[0] + nums[1] = target`. Return `[0, 1]`.

### Implementation
This approach uses a HashMap to efficiently find the required pair by storing each element's value as a key and its index as the value. When iterating through the array, it checks if the complement (target - current value) exists in the map. If it does, the solution has been found.

### Provided Code
```java
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0; i < nums.length; i++) {
        int currEle = nums[i];
        int remaining = target - currEle;
        
        if(map.containsKey(remaining)) {
            int eleIndex = map.get(remaining);
            return new int[]{eleIndex, i};
        }
        map.put(currEle, i);
    }
    return new int[]{-1, -1}; // Ideally, this case will never be reached as per problem statement
}
```

### Time and Space Complexity
- **Time Complexity:** O(n), where `n` is the number of elements in the array. Each element is inserted and looked up in the hashmap exactly once.
- **Space Complexity:** O(n), where `n` is the size of the input array. In the worst case, all elements are stored in the hashmap.