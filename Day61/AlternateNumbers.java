public class AlternateNumbers {
    public static int[] alternateNumbers(int []a) {
        int n = a.length;
        int[] positive = new int[n];
        int[] negative = new int[n];

        int nCount = 0;
        int pCount = 0;
        for(int i = 0;i<n;i++){
            if(a[i]<0){
                negative[nCount] = a[i];
                nCount++;
            }
            else{
                positive[pCount] = a[i];
                pCount++;
            }
        }

        int index = 0;
        int[] ans = new int[n];
        for(int i=0;i<n;i+=2){
            ans[i] = positive[index];
            ans[i+1] = negative[index];
            ++index;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3};
        int[] ans = alternateNumbers(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}