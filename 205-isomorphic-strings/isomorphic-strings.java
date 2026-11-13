class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> iso1 = new HashMap<>();
        Map<Character, Character> iso2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(iso1.containsKey(ch1)){
                if(Objects.equals(iso1.get(ch1), ch2)){
                    continue;
                } else{
                    return false;
                }
            }
            iso1.put(ch1, ch2);
        }

         for(int i=0; i<t.length(); i++){
            char ch1 = t.charAt(i);
            char ch2 = s.charAt(i);
            
            if(iso2.containsKey(ch1)){
                if(Objects.equals(iso2.get(ch1), ch2)){
                    continue;
                } else{
                    return false;
                }
            }
            iso2.put(ch1, ch2);
        }

        return true;
    }
}