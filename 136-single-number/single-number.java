class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> s = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            s.put(n, s.getOrDefault(n, 0)+1);
        }

        int result = 0;
        for(Map.Entry<Integer, Integer> entry : s.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
