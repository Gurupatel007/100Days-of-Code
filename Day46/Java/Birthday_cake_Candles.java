import java.util.List;

public class Birthday_cake_Candles {
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        int max = 0;
        int count = 0;
        for(int x:candles){
            if(x>max) max = x;
        }
        for(int i=0;i<candles.size();i++){
            if(candles.get(i)==max){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<Integer> candles = List.of(3, 2, 1, 3);
        System.out.println(birthdayCakeCandles(candles));
        
    }
}
