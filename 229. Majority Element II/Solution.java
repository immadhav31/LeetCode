class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
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
            if(mpp.get(i)>nums.length/3){
                ans.add(i);
            }
        }
        return ans;
    }
}