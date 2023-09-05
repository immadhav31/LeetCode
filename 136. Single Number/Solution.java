class Solution {
    public int singleNumber(int[] nums) {
        // int[] hash = new int[6];
        // for(int i=0;i<nums.length;i++){
        //     hash[nums[i]]+=1;
        // }
        // for(int i=0;i<hash.length;i++){
        //     if(hash[i]==1){
        //         return i;
        //     }
        // }
        // return 0;

        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}