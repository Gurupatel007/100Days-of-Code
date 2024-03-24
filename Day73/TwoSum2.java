public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int left = i + 1, right = numbers.length - 1, complement = target - numbers[i];
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (numbers[mid] == complement) {
                    return new int[]{i + 1, mid + 1}; // Adjusting for 1-indexed array
                } else if (numbers[mid] > complement) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSum2 obj = new TwoSum2();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(numbers, target);
        System.out.println("Indices of the two numbers such that they add up to target: " + result[0] + " " + result[1]);   
    }
}