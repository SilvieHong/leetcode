//https://leetcode.com/problems/baseball-game/
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
            switch(operations[i]){
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(st.peek()*2);
                    break;
                case "+":
                    st.push(st.get(st.size()-1)+st.get(st.size()-2));
                    break;
                default :
                    st.push(Integer.parseInt(operations[i]));
            }
        }

        int point = 0;
        for(int i=0; i<st.size();i++){
            point += st.get(i);
        }
        return point;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
