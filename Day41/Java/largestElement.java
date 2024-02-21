public class largestElement {
    static int largestEle(int[] arr,int n){
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,2,0,9};
        int ans = largestEle(arr, arr.length);
        System.out.println("The largest element from arr is: "+ans);   
    }
}