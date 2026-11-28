class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int writes = 2;

        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[writes - 2]){
                nums[writes] = nums[i];
                writes++;
            }
        }

        return writes;
    }
}