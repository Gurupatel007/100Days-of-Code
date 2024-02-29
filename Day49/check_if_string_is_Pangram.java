public class check_if_string_is_Pangram {
    public static boolean checkIfPangram(String sentence) {
        for(int i=97;i<123;i++){
            if(sentence.indexOf((char)i) == -1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);

    }
}