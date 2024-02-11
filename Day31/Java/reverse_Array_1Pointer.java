public class reverse_Array_1Pointer {
        static void swap(int i,int n,int[] arr){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        static void reverse(int i,int[] nums,int n){
            if(i>=(n/2)) return;
            swap(i,n-i-1,nums);
            reverse(i+1,nums,n);
        }
        static int[] reverseArray(int n, int []nums) {
            reverse(0,nums,n);
            return nums;
    
        }
        public static void main(String[] args) {
            int[] arr = {1,5,3,2,4};
            reverse_Array_1Pointer obj = new reverse_Array_1Pointer();
            int[] ans = obj.reverseArray(arr.length,arr);
            for(int i:ans){
                System.out.print(i+" ");
            }
        }
}
