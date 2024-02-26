import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int positiveCount = 0;
        int negativeCount = 0;
        int zeros = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                positiveCount++;
            }
            else if(arr.get(i)<0){
                negativeCount++;
            }
            else{
                zeros++;
            }
        }
        System.out.println(String.format("%.6f", (positiveCount / (double) arr.size())));
System.out.println(String.format("%.6f", (negativeCount / (double) arr.size())));
System.out.println(String.format("%.6f", (zeros / (double) arr.size())));
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
        
    }
}
