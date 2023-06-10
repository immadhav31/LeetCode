class Solution {
    public int[] buildArray(int[] nums) {
        int k = nums.length;
        int array[] = new int[k];
        for(int i=0;i<nums.length;i++){
            array[i]=nums[nums[i]];
        }
        return array;
    }
}
