import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftdiff = 0;
        int rightdiff = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.get(i).size(); j++) {
                if(i == j) {
                    leftdiff += arr.get(i).get(j);   
                }
                if(i + j == arr.get(i).size() - 1) { 
                    rightdiff += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftdiff - rightdiff);

    }
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12));
        System.out.println(diagonalDifference(arr));
        
    }
}
