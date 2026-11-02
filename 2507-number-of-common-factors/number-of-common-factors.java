class Solution {
    public int commonFactors(int a, int b) {
        int x = 1, count = 0;
        int num = a < b? a : b;
        while(x <= num){
            if(a % x == 0 && b % x == 0){
                ++count;
            }

            ++x;
        }

        return count;
    }
}