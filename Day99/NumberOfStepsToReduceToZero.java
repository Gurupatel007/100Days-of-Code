public class NumberOfStepsToReduceToZero {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private static int helper(int digit, int c){
        if(digit==0) return c;
        if(digit%2==0){
            return helper(digit/2 , c+1);
        }
        return helper(digit-1, c+1);
    }
    public static void main(String[] args) {
        NumberOfStepsToReduceToZero obj = new NumberOfStepsToReduceToZero();
        System.out.println(obj.numberOfSteps(14)); // 6
    }
}
