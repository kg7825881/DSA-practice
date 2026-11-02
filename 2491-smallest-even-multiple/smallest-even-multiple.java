class Solution {
    public int smallestEvenMultiple(int n) {
        int x = n;
        while(true){
            if(x % 2 == 0 && x % n == 0) {
                return x;
            }
            ++x;
        }
    }
}