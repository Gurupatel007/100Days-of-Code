public class MinimumCost_to_MoveChips {
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int x: position){
            if(x%2==0) even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = minCostToMoveChips(arr);
        System.out.println(ans); 
    }
}