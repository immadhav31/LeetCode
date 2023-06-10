class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] array = new int[n];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            array[i] = sum;
        }
        return array;
    }
}