## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 55: [06/03/2024]

**Today's Progress**:

Problem Statement:
Generate a spiral matrix of size n x n filled with elements from 1 to n^2 in spiral order.

Approach Explanation:

Initialize Boundaries and Matrix:

- Create an n x n matrix to hold the numbers.
- Set initial boundaries: left = 0, right = n - 1, up = 0, down = n - 1.
- Initialize a counter starting from 1 (to keep track of numbers to be filled in).

Filling the Matrix in Spiral Order:
The process is divided into four main steps that are repeated until the matrix is completely filled:

- Move Right: Fill the top row from left to right.
- Move Down: Fill the rightmost column from top to bottom.
- Move Left: If possible, fill the bottom row from right to left.
- Move Up: If possible, fill the leftmost column from bottom to top.
After completing each step, adjust the boundaries accordingly.

Visualizing the Process:
Assume n = 3, the process to fill the matrix will look like this:

#### Step 1: Move Right and Move Down

1 2 3
0 0 4
0 0 5

After filling the top row, we move right to left (up++), then fill the rightmost column, moving top to bottom (right--).

#### Step 2: Move Left and Move Up

1 2 3
0 0 4
7 6 5

Next, fill the bottom row, moving right to left (since up <= down), then (down--).
Lastly, fill the leftmost column, moving bottom to top (left++).

#### Final Matrix

1 2 3
8 9 4
7 6 5

The spiral matrix is now complete. This showcases the pattern followed in a 3 x 3 matrix. The same logic applies regardless of the size of n.

<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day55/.

### Todays questions

<!-- 1. [Plus One](https://leetcode.com/problems/plus-one/).

2. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/). -->

1. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/).

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
