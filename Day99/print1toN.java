public class print1toN {
    public static void main(String[] args) {
        printNos(5);
    }
    public static void printNos(int N)
    {
        //Your code here
        if(N==0) return;
        printNos(N-1);
        System.out.print(N+" ");
    }
}