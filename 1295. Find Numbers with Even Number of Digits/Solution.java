class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;int a=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int rem = nums[i]%10;
                nums[i]/=10;
                count++;
            }
            if(count%2==0){
                a++;
            }
            count=0;
        }
        return a;
    }
}