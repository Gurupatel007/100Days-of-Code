public class secondLargest {
    static int secLargest(int[] arr , int n){
        int largest = arr[0];
        int slargest = -1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            if(arr[i]!=largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    static int secSmallest(int[] arr,int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,4,6,5,3,2};
        int slargest = secLargest(arr, arr.length);
        int ssmallest = secSmallest(arr, arr.length);
        System.out.println("The second largest element from arr is: "+slargest);
        System.out.println("The second smallest element is: "+ssmallest); 
    }
}
