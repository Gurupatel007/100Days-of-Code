## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 61: [12/03/2024]

**Today's Progress**:

## Rearrange Array Elements by Signs

This problem involves reordering an array so that positive and negative numbers are alternated. It's an interesting challenge that tests your ability to manipulate array indices and understand logical partitioning of data.

### Approach:

1. **Initialization**: 
    - Create two separate arrays, `positive[]` and `negative[]`, to store positive and negative numbers, respectively. 
    - Initialize counters for both arrays (`pCount` for positives and `nCount` for negatives).

2. **Partitioning**: 
    - Iterate through the input array `a`.
    - If an element is negative, add it to the `negative` array and increment `nCount`.
    - If an element is positive, add it to the `positive` array and increment `pCount`.

3. **Merging**: 
    - Initialize a new array `ans` to store the rearranged elements.
    - Use an index `i` to fill `ans`, incrementing by 2 each time to ensure alternation.
    - Alternate between adding an element from `positive` and `negative` to `ans` using an `index` variable that increments after each pair is added.

### Code:

```java
public int[] rearrangeArray(int[] a) {
    int n = a.length;
    int[] positive = new int[n];
    int[] negative = new int[n];

    int nCount = 0, pCount = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] < 0) {
            negative[nCount++] = a[i];
        } else {
            positive[pCount++] = a[i];
        }
    }

    int index = 0;
    int[] ans = new int[n];
    for(int i = 0; i < n; i += 2) {
        ans[i] = positive[index];
        if(i + 1 < n) ans[i + 1] = negative[index];
        ++index;
    }

    return ans;
}
```
<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day61/

### Todays questions

1. [Rearrange Array Elements by Sign](https://leetcode.com/problems/rearrange-array-elements-by-sign/description/).

<!-- 2. [Remove Element](https://leetcode.com/problems/remove-element/) -->

<!-- 3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/).
1 . [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/). -->

<!-- 5. [Plus Minus](https://www.hackerrank.com/challenges/plus-minus)

1. [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference) -->

<!-- 7. [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum)

8. [Compare the Triplets](https://www.hackerrank.com/challenges/compare-the-triplets)

9. [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum)

10. [Solve Me First](https://www.hackerrank.com/challenges/solve-me-first) -->

<!-- 7. [Missing Number](https://leetcode.com/problems/missing-number/submissions/1186710654/) -->

## Projects

- **Music Player App**: A simple Music player app which plays the songs listed in it by accessing it from internet. - [https://codepen.io/Guru-the-lessful/full/eYXrMLw].

# 100 Days Of Code

Welcome to my journey through the **#100DaysOfCode** challenge! This repository is a living document of my progress, insights, and the projects I'll be tackling over the next 100 days. My goal is to improve my coding skills by dedicating at least an hour every day to coding, learning new technologies, and working on projects.

## About the Challenge

The #100DaysOfCode challenge is a commitment to coding for at least one hour every day for the next 100 days. The goal is to build, experiment, and enhance coding skills by consistently working on projects and learning new concepts. This challenge encourages accountability, sharing progress with the community, and pushing boundaries to learn and grow as a developer.

## Goals

- **Improve Problem-Solving Skills**: Tackle a variety of coding problems to enhance my logical thinking and problem-solving capabilities.
- **Learn New Technologies**: Dedicate time to learning new languages, frameworks, and tools that are relevant to my interests and career goals.
- **Build Projects**: Apply what I learn by building projects. This includes small utility tools, contributing to open source, or even developing full-fledged applications.
- **Consistency**: Cultivate the habit of coding daily, which is crucial for long-term success in the tech industry.

## How to Use This Repository

Feel free to explore this repository to see my progress and the projects I'm working on. Each directory within the repository is organized by project or day, containing all the relevant code and resources. If you're undertaking a similar journey, I hope my experience can provide you with ideas, inspiration, or guidance.

## Connect With Me

I'd love to connect with others who are also on their coding journey! Feel free to reach out to me on [LinkedIn](www.linkedin.com/in/guru-patel-42423b219) or follow me on [Twitter](https://twitter.com/Gurupat11727321). Let's share insights, resources, and support each other.

## Acknowledgments

- Thanks to the #100DaysOfCode community for the inspiration and support.
- [[Striver, Kunal, Love Babbar], Strivers A2Z DSA Course/Sheet]
