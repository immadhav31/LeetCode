class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int[] array = new int[nums.length-1];
        if(nums.length<2){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            array[i] = nums[i+1]-nums[i];
        }
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}