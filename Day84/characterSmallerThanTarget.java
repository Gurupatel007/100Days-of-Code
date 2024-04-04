package Day84;

public class characterSmallerThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(target < letters[mid]){
                right = mid - 1;
            }
            else left = mid+1;
        }

        return letters[left % letters.length];
    }
    public static void main(String[] args) {
        characterSmallerThanTarget obj = new characterSmallerThanTarget();
        char[] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(obj.nextGreatestLetter(arr, target));
    }
}
