class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        
        String wrd = "";

        for(int i=0; i<s.length(); i +=k){
            int x = i+k;
            int sum = 0;
            for(int j=i; j<x; j++){
                if(j<s.length()){
                    char ch = s.charAt(j);
                    sum += (ch - '0');
                }
            }
            wrd = wrd + Integer.toString(sum);
        }


        return digitSum(wrd, k);
    }
}