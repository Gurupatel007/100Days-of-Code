public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,6,4,9,10,15,25,30,41,96,110,201,1520};
        int target = 10;
        int index = binarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    static int binarySearch(int[] arr ,int target, int s, int e){
        if(s>e) return -1;
        int m = s+ (e-s)/2;

        if(arr[m] == target){
            return m;
        } else if (arr[m] < target) {
            return binarySearch(arr,target,m+1,e);
        }
        else{
            return binarySearch(arr,target,s,m-1);
        }
    }
}