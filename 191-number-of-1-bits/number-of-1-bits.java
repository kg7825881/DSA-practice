class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        for(int i=0; i<=31; i++){
            int mask = 1 << i;
            if((mask & n) != 0){
                ++res;
            }
        }

        return res;
    }
}