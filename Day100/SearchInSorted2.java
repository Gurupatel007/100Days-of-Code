public class SearchInSorted2 {
    static boolean search1(int[] arr, int target, int start, int end) {
        // If start index is greater than end index, the target is not found
        if (start > end)
            return false;

        // Calculate the middle index
        int mid = start + (end - start) / 2;

        // If the middle element is the target, return true
        if (arr[mid] == target)
            return true;

        // Check if the current range is sorted
        if (arr[start] < arr[mid]) {
            // If the target is within the sorted range, search in that half
            if (target >= arr[start] && target < arr[mid])
                return search1(arr, target, start, mid - 1);
            // If the target is not within the sorted range, search in the other half
            else
                return search1(arr, target, mid + 1, end);
        } else if (arr[start] > arr[mid]) {
            // If the current range is not sorted, search in the other half
            // If the target is within the other half range, search in that half
            if (target > arr[mid] && target <= arr[end])
                return search1(arr, target, mid + 1, end);
            // If the target is not within the other half range, search in the sorted half
            else
                return search1(arr, target, start, mid - 1);
        } else {
            // Handles the case when arr[start], arr[mid], and arr[end] are equal
            // We can't determine which half to search, so we search both halves
            return search1(arr, target, start, mid - 1) || search1(arr, target, mid + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search1(arr, target, 0, arr.length-1));
    }
}
