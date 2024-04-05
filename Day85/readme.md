## Design HashSet

### Problem Statement
Design a HashSet without using any built-in hash table libraries. Implement the following operations:
- `void add(key)`: Inserts the value `key` into the HashSet.
- `bool contains(key)`: Returns whether the value `key` exists in the HashSet or not.
- `void remove(key)`: Removes the value `key` in the HashSet. If `key` does not exist in the HashSet, do nothing.

### Constraints
- `0 <= key <= 10^6`
- At most `10^4` calls will be made to `add`, `remove`, and `contains`.

## Design HashMap

### Problem Statement
Design a HashMap without using any built-in hash table libraries. Implement the following operations:
- `MyHashMap()` initializes the object with an empty map.
- `void put(int key, int value)`: Inserts a `(key, value)` pair into the HashMap. If the key already exists in the map, update the corresponding value.
- `int get(int key)`: Returns the value to which the specified key is mapped, or `-1` if this map contains no mapping for the key.
- `void remove(key)`: Removes the key and its corresponding value if the map contains the mapping for the key.

### Constraints
- `0 <= key, value <= 10^6`
- At most `10^4` calls will be made to `put`, `get`, and `remove`.

## Implementation
The implementations of both `DesignHashSet` and `DesignHashMap` utilize simple array-based approaches to store and manage data efficiently, while adhering to the constraints and requirements defined in their respective problem statements.

- For **Design HashSet**, a boolean array is utilized to represent the presence of an integer value as either true (present) or false (absent).
- For **Design HashMap**, an integer array, initialized with a default value indicating an empty slot, is used to store key-value pairs.

These implementations provide a foundation for understanding basic data structure operations and can be extended or modified for more advanced use cases.

For more details and code implementation, please refer to the provided source files:
- [DesignHashSet](hashmap.md)
- [DesignHashMap](hashset.md)