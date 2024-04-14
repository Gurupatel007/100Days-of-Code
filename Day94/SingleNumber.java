public class SingleNumber {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR = XOR^nums[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(new int[]{2,2,1})); // 1
        System.out.println(obj.singleNumber(new int[]{4,1,2,1,2})); // 4
        System.out.println(obj.singleNumber(new int[]{1})); // 1
    }
}