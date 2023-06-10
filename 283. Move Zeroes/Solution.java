class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int number:nums){
            if(number!=0){
                nums[i] = number;
                i++;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}