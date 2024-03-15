public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words, but not after the last word
            }
        }

        return reversed.toString();
    }
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = "  hello world  ";
        System.out.println(rw.reverseWords(s)); // Output: "world hello"
    }
}