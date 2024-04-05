# Design HashSet

## Problem Statement
Design a HashSet without using any built-in hash table libraries. Implement the following operations:
- `void add(key)`: Inserts the value `key` into the HashSet.
- `bool contains(key)`: Returns whether the value `key` exists in the HashSet or not.
- `void remove(key)`: Removes the value `key` in the HashSet. If `key` does not exist in the HashSet, do nothing.

## Example
```plaintext
Input:
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]

Output:
[null, null, null, true, false, null, true, null, false]

Explanation:
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

## Implementation
The `DesignHashSet` class uses a boolean array to store elements. A key is directly mapped to an index in the array. If a key is present, its corresponding index in the array is set to `true`, and `false` if the key is removed.

## Code
```java
public class DesignHashSet {

    private boolean[] hashSet;

    public DesignHashSet() {
        hashSet = new boolean[1000001]; // Initialize with maximum possible key value + 1
    }
    
    public void add(int key) {
        hashSet[key] = true;
    }
    
    public void remove(int key) {
        hashSet[key] = false;
    }
    
    public boolean contains(int key) {
        return hashSet[key];
    }
}
```

## Constraints
- `0 <= key <= 10^6`
- At most `10^4` calls will be made to `add`, `remove`, and `contains`.