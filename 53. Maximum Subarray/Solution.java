class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = 0;
        boolean allneg = true;
        int highneg = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                allneg = false;
            }
        }
        if(allneg){
            for(int i:nums){
                if(i>highneg){
                    highneg = i;
                }
            }
            return highneg;
        }
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}