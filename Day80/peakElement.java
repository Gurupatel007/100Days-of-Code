public class peakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            // check if left neightbour greater
            if(mid > 0 && nums[mid] < nums[mid-1]){
                right = mid-1;
            }
            // check if right neightbour is greater
            else if((mid<nums.length-1) && nums[mid] < nums[mid+1] ){
                left = mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        peakElement obj = new peakElement();
        int[] nums = {1,2,3,1};
        System.out.println(obj.findPeakElement(nums));
    }
}