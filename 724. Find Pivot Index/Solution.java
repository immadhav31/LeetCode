class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0,rightsum=0,totalsum=0;
        for(int num : nums){
            totalsum+=num;
        }
        for(int i=0;i<nums.length;i++){
            rightsum = totalsum - leftsum - nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}