class Solution {
    public int majorityElement(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        int n=nums.length;
        if(n%2==0){
            k=n/2;
        }
        else{
            k=(n-1)/2;
        }
        int j=nums[k];
        return j;
    }
}