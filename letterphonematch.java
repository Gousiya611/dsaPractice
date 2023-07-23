class Solution {
     Map<Character, char[]> map = new HashMap<>();
    
    public Solution() {
        map.put('2', new char[] {'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[] {'g', 'h', 'i'});
        map.put('5', new char[] {'j', 'k', 'l'});
        map.put('6', new char[] {'m', 'n', 'o'});
        map.put('7', new char[] {'p', 'q', 'r', 's'});
        map.put('8', new char[] {'t', 'u', 'v'});
        map.put('9', new char[] {'w', 'x', 'y', 'z'});
    }
    public List<String> letterCombinations(String digits) {
          List<String> ans = new ArrayList<String>();
        if (digits == null || digits.length() == 0) return ans;
        StringBuffer sb = new StringBuffer();
        recursion(digits, 0 , sb, ans);
        return ans;
    }
    
    private void recursion(String digits, int i, StringBuffer sb, List<String> ans) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        for(char c : map.get(digits.charAt(i))) {
            sb.append(c);
            recursion(digits, i + 1, sb, ans);
            sb.delete(i, i + 1);
        }
   
        
    }
}
