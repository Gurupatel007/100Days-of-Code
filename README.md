## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 54: [05/03/2024]

**Today's Progress**:

Today was a day full of challenges and learning on #leetcode . I'm excited to share that I've solved four questions, diving into array manipulation and optimization strategies. Here's the rundown of today's achievements:

- ✅ Plus One (Easy)
- ✅ Remove Duplicates from Sorted Array (Easy)
- ✅ Minimum Cost to Move Chips to The Same Position (Easy)
- ✅ Spiral Matrix (Medium)

𝑨𝒑𝒑𝒓𝒐𝒂𝒄𝒉𝒆𝒔 :

#### 𝐏𝐥𝐮𝐬 𝐎𝐧𝐞

- Maano tum ek number ke array ke saath kaam kar rahe ho, jaise ki ek badi sankhya ko digit-by-digit store kiya gaya hai. Last digit mein ek jodne ka kaam hai.

- Last digit se shuru karte hue, agar carry aata hai, toh usse agle digit mein add karte jao.

- Agar end tak carry bacha rahe, toh usse naye array mein add kar do.

Ant mein, array ko reverse karke final answer taiyar karte hain.

#### 𝐑𝐞𝐦𝐨𝐯𝐞 𝐃𝐮𝐩𝐥𝐢𝐜𝐚𝐭𝐞𝐬 𝐟𝐫𝐨𝐦 𝐒𝐨𝐫𝐭𝐞𝐝 𝐀𝐫𝐫𝐚𝐲

- Maan lo ek playlist hai jisme gaane genre ke hisaab se sorted hain, aur tumhe har genre ka sirf ek gaana chahiye.

- Do pointers rakhoge, i jo tumhari "saaf" playlist ko point karega (array ke start mein) aur j jo puri list scan karega.

- Jab j aage badhta hai, aur jab bhi ek "naya genre" milta hai (ek alag value), usse apni playlist mein i position par add karte ho aur i ko aage badha dete ho.

- Is tarike se, array ko sirf unique genres tak "compress" kar dete ho, wahi original array space use karte hue.

#### 𝐌𝐢𝐧𝐢𝐦𝐮𝐦 𝐂𝐨𝐬𝐭 𝐭𝐨 𝐌𝐨𝐯𝐞 𝐂𝐡𝐢𝐩𝐬 𝐭𝐨 𝐓𝐡𝐞 𝐒𝐚𝐦𝐞 𝐏𝐨𝐬𝐢𝐭𝐢𝐨𝐧

- Ek board game ki kalpana karo jisme positions par chips hain, aur adjacent position par jaane ka 1 coin kharcha hota hai, par even number of steps uchal kar jaana free hai.

- Chips ko do groups mein baanto based on unki positions: even positions par aur odd positions par.

- Choonki even steps uchalna free hai, toh calculate karte ho ki sab chips ko ya toh ek odd ya ek even position par le jaane ka cost kya hoga, jo basically hai kitne chips ko 1-step move karna padega.

- Phir, sasta option choose karte ho, ya toh sab chips ko odd ya even positions par le jaakar minimum cost mein.

#### 𝐒𝐩𝐢𝐫𝐚𝐥 𝐌𝐚𝐭𝐫𝐢𝐱

- Maan lo tum ek maze ko represent karte matrix mein ek path bana rahe ho, aur tumhe bahar se andar tak spiral pattern mein chalna hai.

Boundary set karte ho (up, down, left, right) jo current layer ko represent karta hai jise tum navigate kar rahe ho.

- Left se right tak up boundary ke along traverse karte ho, phir right boundary ke down move karte ho. Next, down boundary ke along left traverse karte ho, aur finally left boundary ke up move karte ho.

- Har outer loop complete karne ke baad, boundaries ko inward adjust karte ho (jaise, up++, down--, left++, right--) taaki agle inner layer tak move kar sako.

- Navigate karte waqt, values ko ek ArrayList mein collect karte ho, effectively matrix layers ko ek linear sequence mein convert karte hue spiral path follow karte hue. Ye approach ek pyaaz ko layer by layer unpeel karne jaisa hai, core tak pahunchne tak.

<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day54/.

### Todays questions

1. [Plus One](https://leetcode.com/problems/plus-one/).

2. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/).

4. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/).

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
