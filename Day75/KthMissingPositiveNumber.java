public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // Calculate the number of missing elements up to index mid
            int missing = arr[mid] - (mid + 1);
            
            // If the number of missing elements is less than k, move to the right half
            if (missing < k) {
                left = mid + 1;
            } else {
                // Otherwise, move to the left half including mid
                right = mid;
            }
        }
        return left + k;
    }
    public static void main(String[] args) {
        KthMissingPositiveNumber obj = new KthMissingPositiveNumber();
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(obj.findKthPositive(arr, k)); // Output: 9
    }
}