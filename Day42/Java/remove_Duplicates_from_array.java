public class remove_Duplicates_from_array {
    static int removeDuplicates(int[] arr,int n) {
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String[] args) {
        // remove duplicates from sorted array
        int[] arr = {1,1,2,2,3,3,4,5,5,6};
        int newLength = removeDuplicates(arr, arr.length);
        System.out.println("Length of unique array is: "+newLength); 
    }   
}
