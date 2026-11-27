class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> uniq = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(uniq.containsKey(nums[i])){
                if(i - uniq.get(nums[i]) <= k){
                    return true;
                }
            }

            uniq.put(nums[i], i);
        }

        return false;
    }
}