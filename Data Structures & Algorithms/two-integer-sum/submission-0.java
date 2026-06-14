class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    Map<Integer, Integer > mpp = new HashMap<>();
    for(int i =0 ; i<n ; i++){
        int compliement = target - nums[i];
            if(mpp.containsKey(compliement)){
                return new int[]{ mpp.get(compliement),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};
    }
}
