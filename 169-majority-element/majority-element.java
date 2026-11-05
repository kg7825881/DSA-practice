class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getValue();
            if(num > n/2){
                return e.getKey();
            }
        }

        return -1;
    }
}