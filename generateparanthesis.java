class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> rst = new ArrayList<>();
        if (n <= 0) return rst;
        backtrack(new StringBuilder(), n, n, rst);
        return rst;
    }
    
    private void backtrack(StringBuilder sb, int left, int right, List<String> rst) {
        
        if (left == 0 && right == 0) {
            rst.add(sb.toString());
            return;
        } 
        else if (left < 0 || right < 0) return;
        else if (left > right) return;
        
        sb.append("(");
        backtrack(sb, left - 1, right, rst);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
         backtrack(sb, left, right - 1, rst);
        sb.deleteCharAt(sb.length() - 1);
        
    }
}
