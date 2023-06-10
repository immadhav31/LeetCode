class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] array = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i<n){
                array[i] = nums[i];
            }
            if(i>=n){
                array[i] = nums[i-n];
            }
        }
        return array;
    }
}