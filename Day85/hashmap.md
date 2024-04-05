# Design HashMap

## Problem Statement
Design a HashMap without using any built-in hash table libraries. Implement the following operations:
- `MyHashMap()` initializes the object with an empty map.
- `void put(int key, int value)`: Inserts a `(key, value)` pair into the HashMap. If the key already exists in the map, update the corresponding value.
- `int get(int key)`: Returns the value to which the specified key is mapped, or `-1` if this map contains no mapping for the key.
- `void remove(key)`: Removes the key and its corresponding value if the map contains the mapping for the key.

## Example
```plaintext
Input:
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]

Output:
[null, null, null, 1, -1, null, 1, null, -1]

Explanation:
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1
myHashMap.get(3);    // return -1 (not found)
myHashMap.put(2, 1); // update to [[1,1], [2,1]]
myHashMap.get(2);    // return 1
myHashMap.remove(2); // remove the mapping for 2
myHashMap.get(2);    // return -1 (not found)
```

## Implementation
`DesignHashMap` uses an integer array for storage, with an initial value of `-1` at all indices to denote that no key-value pair is stored at that index. The `put` operation updates or inserts key-value pairs, `get` retrieves values, and `remove` marks a key's value as `-1` to indicate its removal.

## Code
```java
public class DesignHashMap {
    int[] a;

    public DesignHashMap() {
        a = new int[1000001]; // Initialize with maximum possible key value + 1
        Arrays.fill(a, -1); // Initially, no key is mapped
    }
    
    public void put(int key, int value) {
        a[key] = value;
    }
    
    public int get(int key) {
        return a[key];
    }
    
    public void remove(int key) {
        a[key] = -1;
    }
}
```

## Constraints
- `0 <= key, value <= 10^6`
- At most `10^4` calls will be made to `put`, `get`, and `remove`.