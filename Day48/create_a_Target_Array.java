public class create_a_Target_Array {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];

        for(int i=0;i<n;i++){
            int j = i;
            while(j > index[i]){
                target[j] = target[j-1];
                j--;
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
