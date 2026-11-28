class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        int num_of_letters = 0;
        for(String w : words){
            if(num_of_letters + w.length() + cur.size() > maxWidth){
                int totalspaces = maxWidth - num_of_letters;
                int gap = cur.size() - 1;
                StringBuilder sb = new StringBuilder();

                if(gap == 0){
                    sb.append(cur.get(0));
                    sb.append(" ".repeat(totalspaces));
                } else {
                    int spacegap = totalspaces/gap;
                    int extragap = totalspaces%gap;
                    for(int i=0; i<gap; i++){
                        sb.append(cur.get(i));
                        sb.append(" ".repeat(spacegap + (i < extragap ? 1 : 0)));
                    }

                    sb.append(cur.get(gap));
                }

                res.add(sb.toString());
                cur.clear();
                num_of_letters = 0;
            }

            cur.add(w);
            num_of_letters += w.length();
        }

        StringBuilder lastLine = new StringBuilder(String.join(" ", cur));
        lastLine.append(" ".repeat(maxWidth - lastLine.length()));
        res.add(lastLine.toString());

        return res;
    }
}