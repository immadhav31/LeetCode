class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> array = new ArrayList<>();
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                array.add(i);
            }
        }
        return array;
    }
}
