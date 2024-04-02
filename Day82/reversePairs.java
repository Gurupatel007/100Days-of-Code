import java.util.ArrayList;

public class reversePairs {
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    private static int countPairs(int[] arr, int low, int mid, int high){
        int right = mid+1;
        int count = 0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i] > (long)arr[right]*2){
                right++;
            }
            count += right - (mid+1);
        }
        return count;
    }
    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;

        if(low>=high) return count;
        int mid = low + (high-low)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);

        return count;
    }
    public int reversepairs(int[] nums) {
        return mergeSort(nums, 0 , nums.length-1);
    }
    public static void main(String[] args) {
        reversePairs obj = new reversePairs();
        int[] arr = {1,3,2,3,1};
        System.out.println(obj.reversepairs(arr));
    }
}