public class largest_Altitude {
    public static int largestAltitude(int[] gain) {
        int max=0,sum=0;
        for(int no:gain){
            sum+=no;
            if(max < sum) max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int ans = largestAltitude(arr);
        System.out.println(ans);
    }
}