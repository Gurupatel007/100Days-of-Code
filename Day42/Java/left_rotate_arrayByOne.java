public class left_rotate_arrayByOne {
    static int[] rotateArrayByOne(int[] arr, int n){
        int[] ans = new int[n];
        int temp = arr[0];
        for(int i=1;i<=n;i++){
            if(i==n){
                ans[i-1] = temp; 
            }
            else{
                ans[i-1] = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int n = 5;
        int [] arr = {1,2,3,4,5};
        int[] ans = rotateArrayByOne(arr,arr.length);
        System.out.println("Rotated array is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}