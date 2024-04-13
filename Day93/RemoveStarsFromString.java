public class RemoveStarsFromString {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                // Remove the last character if there's a '*' and the result is not empty
                if (result.length() > 0) {
                    result.setLength(result.length() - 1);
                }
            } else {
                // Add the current character to the result if it's not '*'
                result.append(ch);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }
    public static void main(String[] args) {
        RemoveStarsFromString removeStarsFromString = new RemoveStarsFromString();
        System.out.println(removeStarsFromString.removeStars("ab**cd")); // Output: cd
        System.out.println(removeStarsFromString.removeStars("ab*cd")); // Output: acd
        System.out.println(removeStarsFromString.removeStars("ab**cd**")); // Output: ""
        System.out.println(removeStarsFromString.removeStars("ab**cd**e")); // Output: e
    }
}