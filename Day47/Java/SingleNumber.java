public class SingleNumber {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR = XOR^nums[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(nums));
    }
}
