# Group Anagrams

## Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Examples

- **Example 1:**
  - Input: `strs = ["eat","tea","tan","ate","nat","bat"]`
  - Output: `[["bat"],["nat","tan"],["ate","eat","tea"]]`
  - Explanation: As depicted, anagrams are grouped.

- **Example 2:**
  - Input: `strs = [""]`
  - Output: `[[""]]`
  - Explanation: An array with an empty string groups into itself.

- **Example 3:**
  - Input: `strs = ["a"]`
  - Output: `[["a"]]`
  - Explanation: An array with a single character string groups into itself.

## Constraints

- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

## Code Walkthrough

The solution involves sorting each string and using the sorted string as a key in a `HashMap`. This way, all anagrams will have the same sorted key and thus can be grouped together in the map. Finally, the lists of strings from the map are collected into a single list of lists.

## Visualization

Imagine the input is `["eat","tea","tan","ate","nat","bat"]`. After sorting each string, we get:
- `eat`, `tea`, `ate` → `aet`
- `tan`, `nat` → `ant`
- `bat` → `abt`

These sorted strings serve as keys in the map, grouping the original strings accordingly.

## Implementation

### Code

```java
public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return new ArrayList<>();
    
    Map<String, List<String>> map = new HashMap<>();
    
    for (String s : strs) {
        String sorted = sortString(s); // Sort the string to use as a key
        if (!map.containsKey(sorted)) {
            map.put(sorted, new ArrayList<>());
        }
        map.get(sorted).add(s); // Add the original string to the correct list
    }
    
    return new ArrayList<>(map.values());
}

private static String sortString(String inputString) {
    char tempArray[] = inputString.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
}
```

## Time and Space Complexity

- **Time Complexity:** O(NKlogK), where `N` is the number of strings, and `K` is the maximum length of a string in `strs`. Sorting each string takes O(KlogK) time, and we do it for each of the `N` strings.
- **Space Complexity:** O(NK), to store the map and the list of anagrams. In the worst case, all strings are different, requiring to store each string in the map and the resultant list.