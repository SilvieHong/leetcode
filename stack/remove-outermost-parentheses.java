// https://leetcode.com/problems/remove-outermost-parentheses/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(') {
                if (!st.empty()) {
                    sb.append("(");
                }
                st.push(i);
            } else {
                st.pop();
                if (!st.empty()) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
