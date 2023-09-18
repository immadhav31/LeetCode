class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i],mpp.get(nums[i])+1);
            }
            else{
                mpp.put(nums[i],1);
            }
        }
        for(int i:mpp.keySet()){
            if(mpp.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}