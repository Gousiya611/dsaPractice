class Solution {
    public int longestValidParentheses(String s) {
         int ans = 0;
        char l = '(';
        char r = ')';
        int i =0;
        int j;
        int[] save = new int[s.length()];
        
        while (i<s.length()){
            j = i;
            Stack<Integer> st = new Stack<Integer>();
            while(j<s.length()){
                if (s.charAt(j) == l) st.add(j);
                else{
                    if (st.isEmpty()) {
                        i = j+1;
                        break;
                    }
                    save[st.pop()] = 1;
                    save[j] = 1;
                    if (st.isEmpty()) {
                         i = j+1;
                        break;
                    }
                }
                if (j==s.length()-1) i=j+1;
                j++;
            }
        }
        
        i = 0;
        while (i<s.length()){
            if (save[i] != 1) {
                i++;
                continue;
            }
            j = i;
            while (j<s.length() && save[j] == save[i]) {
                j++;
            }
            if ((j-i)>ans) ans = (j-i);
             i = j;
        }
        
        return ans;
        
    }
}
