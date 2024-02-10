public class N_to_1_Recursion {
    static void printvalues(int i,int x,int[] arr){
        if(x<=0) return;
        else{
            arr[i-1] =x;
            printvalues(i+1, x-1, arr); 
        }
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        printvalues(1, x, arr);
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ans = printNos(n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
