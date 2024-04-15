package Day95;

public class CapacityToShipPackages {
    public boolean feasible(int capacity, int[] weights, int days){
        int day = 1;
        int total = 0;

        for(int wh: weights){
            total+=wh;
            if(total>capacity){
                total = wh;
                day+=1;
                if(day > days){
                    return false;
                }
            }
        }
        return true;
    } 
    public int shipWithinDays(int[] weights, int days) {
        // int left = Arrays.stream(weights).max().getAsInt();
        // int right = IntStream.of(weights).sum();
        int left = 0;
        int right = 0;
        for(int val :weights){
            right +=val;
            left = Math.max(left,val);
        }
        if(weights.length==days){
            return left;
        }
        while(left <= right){
            int mid = left + (right-left)/2;

            if (feasible(mid, weights, days)){
                right = mid-1;
            }
            else left = mid+1;
        }

        return left;
    }
    public static void main(String[] args) {
        CapacityToShipPackages obj = new CapacityToShipPackages();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(obj.shipWithinDays(weights, days));
    }
}