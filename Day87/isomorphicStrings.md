## Isomorphic Strings

### Problem Statement
Determine if two strings, `s` and `t`, are isomorphic. Two strings are considered isomorphic if the characters in `s` can be replaced to get `t`. Every occurrence of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

### Example
- **Input 1:** `s = "egg"`, `t = "add"`  
  **Output 1:** `true`  
  Each character from `s` can be replaced to get `t`.

- **Input 2:** `s = "foo"`, `t = "bar"`  
  **Output 2:** `false`  
  Characters in `s` and `t` do not map consistently to each other.

- **Input 3:** `s = "paper"`, `t = "title"`  
  **Output 3:** `true`  
  Each character from `s` maps to a corresponding character in `t` in a one-to-one mapping.

### Code Walkthrough
To check if `s` and `t` are isomorphic:
1. **Length Check**: Immediately return `false` if `s` and `t` have different lengths, as they can't be isomorphic.
2. **Two Hash Maps**: Use two hash maps, `StoT` and `TtoS`, to track the mappings from `s` to `t` and `t` to `s`, respectively.
3. **Iterate Through Characters**: For each character in `s` and its corresponding character in `t`:
   - Check if the current character from `s` is already mapped to a different character in `t`. If so, return `false`.
   - Check if the current character from `t` is already mapped to a different character in `s`. If so, return `false`.
   - Map the current characters from `s` to `t` and from `t` to `s`.
4. **Return True**: If no conflicts are found, return `true`, indicating the strings are isomorphic.

### Visualization for Input 1: `s = "egg"`, `t = "add"`
- Initialize `StoT = {}`, `TtoS = {}`.
- Iterate through each character:
  - Map `e` to `a`, and `a` to `e`. Now, `StoT = {e -> a}`, `TtoS = {a -> e}`.
  - Map `g` to `d`, and `d` to `g`. Now, `StoT = {e -> a, g -> d}`, `TtoS = {a -> e, d -> g}`.
- Since all characters can be mapped consistently, the strings are isomorphic.

### Implementation
The solution uses two hash maps to ensure that each character in `s` can be uniquely mapped to a character in `t` and vice versa, fulfilling the conditions for the strings to be isomorphic.

### Provided Code
```java
public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    HashMap<Character, Character> StoT = new HashMap<>();
    HashMap<Character, Character> TtoS = new HashMap<>();
    
    for(int i = 0; i < s.length(); i++) {
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);
        
        if(StoT.containsKey(sChar) && StoT.get(sChar) != tChar) {
            return false;
        }
        
        if(TtoS.containsKey(tChar) && TtoS.get(tChar) != sChar) {
            return false;
        }
        
        StoT.put(sChar, tChar);
        TtoS.put(tChar, sChar);
    }
    return true;
}
```

### Time and Space Complexity
- **Time Complexity:** O(n), where `n` is the length of the strings. The code iterates through each character of the strings exactly once.
- **Space Complexity:** O(1), because the size of the character set is fixed (assuming the character set is ASCII or Unicode, the number of potential characters is constant), the hash maps will have at most the size of the character set.