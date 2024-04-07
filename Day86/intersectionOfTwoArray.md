## Intersection of Two Arrays

### Problem Statement
Given two integer arrays `nums1` and `nums2`, the objective is to find the intersection of these two arrays. The intersection includes all the unique elements present in both arrays. The result can be returned in any order.

### Example
- **Input 1:** `nums1 = [1,2,2,1]`, `nums2 = [2,2]`  
  **Output 1:** `[2]`  
  **Explanation:** Both arrays contain the number `2`. Despite `2` appearing more than once in both arrays, it should be included only once in the output.

- **Input 2:** `nums1 = [4,9,5]`, `nums2 = [9,4,9,8,4]`  
  **Output 2:** `[9,4]` or `[4,9]`  
  **Explanation:** Both arrays contain the numbers `4` and `9`. The order of the result does not matter.

### Code Walkthrough
The solution employs two `HashSet`s to efficiently find the unique intersection of the two arrays:
1. **Initialize** a `HashSet` named `set1` to store unique elements from the first array (`nums1`).
2. **Fill `set1`**: Iterate through `nums1`, adding each element to `set1`. This removes any duplicates from `nums1`.
3. **Initialize** another `HashSet` named `intersection` to store the intersection elements.
4. **Find Intersection**: Iterate through `nums2`, checking each element against `set1`:
   - If an element from `nums2` is found in `set1`, it means this element is present in both arrays. Add this element to `intersection`.
   - This step ensures each element in the intersection is unique.
5. **Convert `intersection` to array**: Finally, convert the `intersection` set into an array to return the result.

### Visualization
Let's consider the second example for visualization:
- `nums1 = [4,9,5]`, `nums2 = [9,4,9,8,4]`
- After adding elements from `nums1` to `set1`, `set1 = {4, 9, 5}`.
- Iterating through `nums2`, `9` and `4` are found in `set1`, so they are added to `intersection`. `intersection = {4, 9}`.
- Convert `intersection` to an array, resulting in `[4,9]` or `[9,4]`.

### Implementation
The algorithm is implemented as follows:
1. Create a `HashSet` (`set1`) to store unique elements from the first array.
2. Populate `set1` with elements from `nums1`.
3. Create another `HashSet` (`intersection`) to identify and store unique elements present in both arrays.
4. Iterate through `nums2`, checking if each element exists in `set1`. If so, add it to `intersection`.
5. Convert the `intersection` set into an array to form the final result.

### Code
```java
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        for(int num : array1){
            set1.add(num);
        }
        
        for(int num : array2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        
        int[] result = new int[intersection.size()];
        int i = 0;
        for(int num : intersection){
            result[i++] = num;
        }
        return result;
    }
}
```

### Time and Space Complexity
- **Time Complexity:** O(n + m) - Where `n` is the length of `nums1` and `m` is the length of `nums2`. Each array is iterated over once. The operations of adding to and checking for existence in a `HashSet` are O(1) on average, leading to a linear time complexity overall.
- **Space Complexity:** O(n + m) - In the worst case, if all elements are unique, `set1` and `intersection` can store up to `n` and `m` elements, respectively, leading to a linear space complexity.