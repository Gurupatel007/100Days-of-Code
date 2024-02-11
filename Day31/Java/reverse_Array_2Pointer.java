public class reverse_Array_2Pointer {
    static void swap(int i,int n,int[] arr){
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }
    static void reverse(int i,int[] nums,int n){
        if(i>=n) return;
        swap(i,n,nums);
        reverse(i+1,nums,n-1);
    }
    public int[] reverseArray(int n, int[] nums) {
        reverse(0,nums,n-1);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4};
        reverse_Array_2Pointer obj = new reverse_Array_2Pointer();
        int[] ans = obj.reverseArray(arr.length,arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}