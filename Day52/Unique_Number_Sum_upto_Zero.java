public class Unique_Number_Sum_upto_Zero {
    public static int[] sumZero(int n) {
        int[] answer = new int[n];
        for (int i = 1; i<n; i+=2) {
            answer[i-1]=i;
            answer[i]=-i;
        }
        return answer;

    }
    public static void main(String[] args) {
        int n = 10;
        int[] ans = sumZero(n);
        for(int x:ans){
            System.out.println(x);
        }
    }
}
