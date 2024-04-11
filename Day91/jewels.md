# Jewels and Stones

## Problem Statement

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

## Examples

- **Example 1:**
  - Input: `jewels = "aA", stones = "aAAbbbb"`
  - Output: `3`
  - Explanation: There are three stones that are also jewels: "a", "A", and "A".

- **Example 2:**
  - Input: `jewels = "z", stones = "ZZ"`
  - Output: `0`
  - Explanation: There are no stones that are also jewels.

## Constraints

- `1 <= jewels.length, stones.length <= 50`
- `jewels` and `stones` consist of only English letters.
- All the characters of `jewels` are unique.

## Code Walkthrough

The solution involves using a HashSet to store the types of jewels. Then, iterate through each stone in `stones` and check if it exists in the HashSet of jewels. If yes, increment the count.

### Code

```java
public int numJewelsInStones(String jewels, String stones) {
    Set<Character> set = new HashSet<>();
    int count = 0;
    
    for(char ch : jewels.toCharArray()){
        set.add(ch);
    }
    
    for(int i=0;i<stones.length();i++){
        char currEle = stones.charAt(i);
        if(set.contains(currEle)){
            count++;
        }
    }
    return count;
}
```

## Time and Space Complexity

- **Time Complexity:** O(J + S), where `J` is the length of `jewels` and `S` is the length of `stones`. It takes O(J) time to construct the set of jewels, and O(S) time to iterate through the stones.
- **Space Complexity:** O(J), where `J` is the number of unique jewels. The space used by the HashSet to store the types of jewels.