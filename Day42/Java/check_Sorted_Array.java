public class check_Sorted_Array {
    static int isSorted(int n, int []a) {
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,3,4,4,5,6,7,10};
        int ans = isSorted(arr.length, arr);
        System.out.println(ans);
    }
}
