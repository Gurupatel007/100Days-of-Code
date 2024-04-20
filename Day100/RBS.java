public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end) {
        // If start index is greater than end index, the target is not found
        if (start > end) 
            return -1;
        
        // Calculate the middle index
        int mid = start + (end - start) / 2;
        
        // If the middle element is the target, return its index
        if (arr[mid] == target) 
            return mid;
        
        // Check if the current range is sorted
        if (arr[start] <= arr[mid]) {
            // If the target is within the sorted range, search in that half
            if (target >= arr[start] && target <= arr[mid]) 
                return search(arr, target, start, mid - 1);
            // If the target is not within the sorted range, search in the other half
            else 
                return search(arr, target, mid + 1, end);
        }
        // If the current range is not sorted, search in the other half
        else {
            // If the target is within the other half range, search in that half
            if (target >= arr[mid] && target <= arr[end]) 
                return search(arr, target, mid + 1, end);
            // If the target is not within the other half range, search in the sorted half
            else 
                return search(arr, target, start, mid - 1);
        }
    }
    
}
