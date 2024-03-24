// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
                if (st.size() > depth) depth = st.size();
            }
            if (s.charAt(i) == ')') st.pop();
        }
        
        return depth;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
