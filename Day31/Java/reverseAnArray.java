// package Day31.Java;  

public class reverseAnArray {
    static void reversedArr(int n,int[] nums ,int[] revarr){
        if(n<0) return;
        revarr[n] = nums[nums.length-n-1];
        reversedArr(n-1, nums,revarr);
    }
    static int[] reverseArray(int n, int[] nums)
    {
        int[] revArr = new int[n];
        reversedArr(n-1 , nums, revArr);
        return revArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] revArr = reverseArray(arr.length, arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(revArr[i]+" ");
        }
    }
}
