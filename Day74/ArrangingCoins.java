public class ArrangingCoins {
    public int arrangeCoins(int n) {
        // Initialize the left and right pointers
        long left = 0, right = n;
        long mid, currSum;
        
        while (left <= right) {
            // Calculate the middle value
            mid = left + (right - left) / 2;
            
            // Calculate the sum of the first mid integers
            currSum = mid * (mid + 1) / 2;
            
            // Adjust the search space based on the comparison with n
            if (currSum == n) {
                // If the sum exactly matches n, we've found the largest k
                return (int) mid;
            } else if (currSum < n) {
                // If the sum is less than n, move the left pointer to the right
                left = mid + 1;
            } else {
                // If the sum is greater than n, move the right pointer to the left
                right = mid - 1;
            }
        }
        
        // Return the right pointer, which is the largest k satisfying the condition
        return (int) right;
    }
    public static void main(String[] args) {
        ArrangingCoins obj = new ArrangingCoins();
        System.out.println(obj.arrangeCoins(5)); // 2
        System.out.println(obj.arrangeCoins(8)); // 3
    }
}
