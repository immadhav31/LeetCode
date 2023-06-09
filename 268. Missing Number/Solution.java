class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                k++;
            }
            else{
                a=k;
            }
        }
        if(nums[nums.length-1]==nums.length-1){
            a = nums.length;
        }
        return a;
    }
}