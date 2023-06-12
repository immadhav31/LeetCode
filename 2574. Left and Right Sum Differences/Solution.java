class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            left[i]=leftSum;
            leftSum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            right[i]=rightSum;
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(right[i]-left[i]);
        }
        return nums;
    }
}