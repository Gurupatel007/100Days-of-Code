package Day29.java;

public class NtoOneWithoutLoop1 {
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
        int[] arr = printNos(10);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
